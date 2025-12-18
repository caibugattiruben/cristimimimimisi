/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

import static crisimimis.Eventi.FESTA;
import static crisimimis.Eventi.LA_MI_NONNA;
import static crisimimis.Eventi.PIETRO_GRINCH;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;


/**
 *
 * @author caibugatti.ruben
 */
public class CatenaDiMontaggio {
    private String nome;
    Materiale materiale;
    Eventi e;
    ArrayList<Elfo> elfi=new ArrayList();
    ArrayList<Macchinario> macchinari=new ArrayList();
    Giocattolo g;
    private String coll;
    private Clip clip;
    
    public CatenaDiMontaggio(){
        this.nome="FABBRICA 4D";
    }
    
    public void mat(String m){
        materiale=Materiale.tipoMat(m);
    }
    public String getNomeMat(){
        return materiale.name();
    } 
    public String creoElfo(String e) {
        boolean presente = false;
        coll="";
        switch (e) {
            case "ELFO PROGETTATORE":
                for (Elfo elf : elfi) {
                    if (elf instanceof ElfoProgettatore) {
                        presente = true;
                        break;
                    }
                }
                if (presente==false) {
                    elfi.add(new ElfoProgettatore());
                    coll = "/crisimimis/Immagini/lleshiProgettatore.png";
                }
                break;

            case "ELFO ASSEMBLATORE":
                for (Elfo elf : elfi) {
                    if (elf instanceof ElfoAssemblatore) {
                        presente = true;
                        break;
                    }
                }
                if (presente==false) {
                    elfi.add(new ElfoAssemblatore());
                    coll = "/crisimimis/Immagini/trivellaAssemblatore.png";
                }
                break;

            case "ELFO NEVICATORE":
                for (Elfo elf : elfi) {
                    if (elf instanceof ElfoNevicatore) {
                        presente = true;
                        break;
                    }
                }
                if (presente==false) {
                    elfi.add(new ElfoNevicatore());
                    coll = "/crisimimis/Immagini/IO.png";
                }
                break;

            case "ELFO MAGICO":
                for (Elfo elf : elfi) {
                    if (elf instanceof ElfoMagico) {
                        presente = true;
                        break;
                    }
                }
                if (presente==false) {
                    elfi.add(new ElfoMagico());
                    coll = "/crisimimis/Immagini/cessiMagico.png";
                }
                break;

            case "ELFO CONTROLLORE":
                for (Elfo elf : elfi) {
                    if (elf instanceof ElfoControllore) {
                        presente = true;
                        break;
                    }
                }
                if (presente==false) {
                    elfi.add(new ElfoControllore());
                    coll = "/crisimimis/Immagini/altrotipoControllore.png";
                }
                break;
        }

        return coll;
}
    public String creoMacchinario (String e) {
        boolean presente = false;
        coll="";
        switch (e) {
            case "MACCHINARIO PROGETTATORE":
                for (Macchinario mac : macchinari) {
                    if (mac instanceof MacchinarioProgettatore) {
                        presente = true;
                        break;
                    }
                }
                if (presente==false) {
                    macchinari.add(new MacchinarioProgettatore());
                    coll = "/crisimimis/Immagini/MacchinarioLleshi.png";
                }
                break;

            case "MACCHINARIO ASSEMBLATORE":
                for (Macchinario mac : macchinari) {
                    if (mac instanceof MacchinarioAssemblatore) {
                        presente = true;
                        break;
                    }
                }
                if (presente==false) {
                    macchinari.add(new MacchinarioAssemblatore());
                    coll = "/crisimimis/Immagini/MacchinarioTrive.png";
                }
                break;

            case "MACCHINARIO NEVICATORE":
                for (Macchinario mac : macchinari) {
                    if (mac instanceof MacchinarioNevicatore) {
                        presente = true;
                        break;
                    }
                }
                if (presente==false) {
                    macchinari.add(new MacchinarioNevicatore());
                    coll = "/crisimimis/Immagini/MacchinarioIo.png";
                }
                break;

            case "MACCHINARIO MAGICO":
                for (Macchinario mac : macchinari) {
                    if (mac instanceof MacchinarioMagico) {
                        presente = true;
                        break;
                    }
                }
                if (presente==false) {
                    macchinari.add(new MacchinarioMagico());
                    coll = "/crisimimis/Immagini/MacchinarioCessi.png";
                }
                break;

            case "MACCHINARIO CONTROLLORE":
                for (Macchinario mac : macchinari) {
                    if (mac instanceof MacchinarioControllore) {
                        presente = true;
                        break;
                    }
                }
                if (presente==false) {
                    macchinari.add(new MacchinarioControllore());
                    coll = "/crisimimis/Immagini/MacchinarioTizio.png";
                }
                break;
        }

        return coll;
}
    public Giocattolo creoGioco(int q,String n){
        g=new Giocattolo(q,n,materiale);
        return g;
    }
    public String sceltaPacco(){
        return g.sceltaPacco();
    }
    public void pulisciElfi(){
        elfi.clear();
    }
    public void pulisciMacchinari(){
        macchinari.clear();
    }
    public Eventi evento(){
        e=Eventi.sceltaEvento();
        
        switch (e){
            case PIETRO_GRINCH:
                this.pulisciElfi();
                this.pulisciMacchinari();
                g.qualità=0;
                return PIETRO_GRINCH;
                
            case FESTA:
                Random rdn=new Random();
                int bueno=rdn.nextInt(10);
                if(bueno<5){
                    if(g.qualità<=180){
                        g.qualità=180;
                    }
                }
                else{
                    this.pulisciElfi();
                    this.pulisciMacchinari();
                    g.qualità=10;
                }
                return FESTA;
                
            case LA_MI_NONNA:
                g.qualità=200;
                return LA_MI_NONNA;
                
        }
        return LA_MI_NONNA;
    }
    public String getNomeEv(){
        return e.name();
    } 
    public void suono(){
        try {
            File soundFile = new File("src/crisimimis/Suono/song.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            clip = AudioSystem.getClip();
            clip.open(audioStream);
            
            FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            volume.setValue(-18.0f); 

            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public String materiale(String materiale){
        switch (materiale){
            case "PLASTICA":
                return "/crisimimis/Immagini/plastica.png";
            case "LEGNO":
                return "/crisimimis/Immagini/legno.png";
            case "FERRO":
                return "/crisimimis/Immagini/ferro.png";
            case "CRISTALLODINEVE":
                return "/crisimimis/Immagini/neve.png";
            case "FRAMMENTOMAGICO":
                return "/crisimimis/Immagini/magico.png";
        }
        return null;
    }
}
