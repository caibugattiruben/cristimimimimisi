/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

/**
 *
 * @author caibugatti.ruben
 */
public class ElfoAssemblatore extends Elfo {
    public ElfoAssemblatore(){
        super("Trivella");
    }
    
    
    
    public int Assembla(Materiale m,boolean mac){
        if(m==Materiale.PLASTICA){
            
            if(mac==true){
                return 15;
            }
            else{
                return 5;
            }
            
        }
        else{
            return 25;
        }
    }
}
