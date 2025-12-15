/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

/**
 *
 * @author caibugatti.ruben
 */
public class MacchinarioNevicatore extends Macchinario {
    public MacchinarioNevicatore(){
        super("Nevicatore");
    }
    
    public int neve(int pos){
        switch (pos){
            case 0:
                return 0;
            case 1:
                return 5;
            case 2:
                return 25;
            case 3:
                return 10;
        }
        return 0;
    }
}
