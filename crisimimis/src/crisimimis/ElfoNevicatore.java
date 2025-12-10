/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

/**
 *
 * @author caibugatti.ruben
 */
public class ElfoNevicatore extends Elfo {
    public ElfoNevicatore(){
        super("Ruben","ER CONSIGLIO:\n-1 lleshi\n-2 Trivella\n-3 io\n-4 Cesare\nCome materiale usa frammento magico e associa bene i macchinari");
    }
    
    public int Nevica(Materiale m,boolean mac){
        if(m==Materiale.FRAMMENTOMAGICO){
            
            if(mac==true){
                return 25;
            }
            else{
                return 10;
            }
            
        }
        else if(m==Materiale.CRISTALLODINEVE){
            if(mac==true){
                return 20;
            }
            else{
                return 5;
            }
        }
        else{
            return 0;
        }
    }
}
