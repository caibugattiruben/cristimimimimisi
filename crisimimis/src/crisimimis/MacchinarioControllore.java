/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

/**
 *
 * @author caibugatti.ruben
 */
public class MacchinarioControllore extends Macchinario {
    public MacchinarioControllore(){
        super("Controllore");
    }
    
    
    public int controllo(int pos){
        switch (pos){
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 5;
            case 3:
                return 15;
        }
        return 0;
    }
}
