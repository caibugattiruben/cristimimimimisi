/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

/**
 *
 * @author caibugatti.ruben
 */
public class MacchinarioMagico extends Macchinario {
    public MacchinarioMagico(){
        super("Magico");
    }
    public int progetto(int pos){
        switch (pos){
            case 0:
                return 0;
            case 1:
                return 5;
            case 2:
                return 15;
            case 3:
                return 25;
        }
        return 0;
    }
}
