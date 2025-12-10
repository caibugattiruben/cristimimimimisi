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

    ElfoProgettatore eProg=new ElfoProgettatore();
    ElfoAssemblatore eAss=new ElfoAssemblatore();
    ElfoNevicatore eNev=new ElfoNevicatore();
    ElfoMagico eMag=new ElfoMagico();
    ElfoControllore eCon=new ElfoControllore();
    
    private String coll;
    
    public CatenaDiMontaggio(){
        
    }
    
    public void mat(String m){
        materiale=Materiale.tipoMat(m);
    }
    public String getNome(){
        return materiale.name();
    } 
    public String creoELFO(String e){
        switch (e) {
            case "ELFO PROGETTATORE":
                if(!elfi.contains(eProg)){
                    elfi.add(eProg);
//                    coll="/crisimimis/Immagini/lleshiProgettatore.png";
                }
                break;
            case "ELFO ASSEMBLATORE":
                if(!elfi.contains(eAss)){
                    elfi.add(eAss);
                }
                break;
            case "ELFO NEIVCARTORE":
                if(!elfi.contains(eNev)){
                    elfi.add(eNev);
                }
                break;
            case "ELFO MAGICO":
                if(!elfi.contains(eMag)){
                    elfi.add(eMag);
                }
                break;
            case "ELFO CONTROLLORE":
                if(!elfi.contains(eCon)){
                    elfi.add(eCon);
                }
                break;
        }
        return coll;
    }
    
}
