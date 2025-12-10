/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

/**
 *
 * @author caibugatti.ruben
 */
public class ElfoMagico extends Elfo {
    public ElfoMagico(){
        super("Cesare","Ci vuole un po di colore <3");
    }
    
    public int Magia(Materiale m,boolean mac){
        if(m==Materiale.FRAMMENTOMAGICO){
            
            if(mac==true){
                return 25;
            }
            else{
                return 10;
            }
            
        }
        else{
            return 0;
        }
    }
    
}
