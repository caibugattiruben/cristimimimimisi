/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

import java.util.ArrayList;


/**
 *
 * @author caibugatti.ruben
 */
public class CatenaDiMontaggio {
    Materiale materiale;
    ArrayList<Elfo> elfi=new ArrayList();
    ArrayList<Macchinario> macchinari=new ArrayList();
    Giocattolo g;
    private String coll;
    
    public CatenaDiMontaggio(){
        
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
                    coll = "/crisimimis/Immagini/lleshiProgettatore.png";
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
                    coll = "/crisimimis/Immagini/trivellaAssemblatore.png";
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
                    coll = "/crisimimis/Immagini/IO.png";
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
                    coll = "/crisimimis/Immagini/cessiMagico.png";
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
                    coll = "/crisimimis/Immagini/altrotipoControllore.png";
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
    
}
