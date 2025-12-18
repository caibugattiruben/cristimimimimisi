/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

/**
 *
 * @author caibugatti.ruben
 */
public class ElfoProgettatore extends Elfo {
    
    public ElfoProgettatore(){
        super("Lleshi");
    }
        public int Progetta(Materiale m,boolean mac){
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
        else if(m==Materiale.FERRO){
            if(mac==true){
                return 15;
            }
            else{
                return 5;
            }
        }
        else if(m==Materiale.LEGNO){
            if(mac==true){
                return 10;
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


 