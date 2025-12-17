/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;
import java.util.Random;
/**
 *
 * @author caibugatti.ruben
 */
public enum Eventi {
    
    PIETRO_GRINCH,
    FESTA,
    LA_MI_NONNA;
    
    public static Eventi sceltaEvento(){
        Random rdn=new Random();
        int n=rdn.nextInt(3);
        
        switch (n){
            case 0:
                return PIETRO_GRINCH;
            case 1:
                return FESTA;
            case 2:
                return LA_MI_NONNA;
            default:
                return LA_MI_NONNA;
        }
    }
}
