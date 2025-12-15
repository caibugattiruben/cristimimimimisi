/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

/**
 *
 * @author caibugatti.ruben
 */
public class MacchinarioProgettatore extends Macchinario {
    public MacchinarioProgettatore(){
        super("Progettatore");
    }
    
     public int progetto(int pos){
        switch (pos){
            case 0:
                return 25;
            case 1:
                return 15;
            case 2:
                return 5;
            case 3:
                return 0;
        }
        return 0;
    }
}
