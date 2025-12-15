/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

/**
 *
 * @author caibugatti.ruben
 */
public class ElfoControllore extends Elfo {
    
    public ElfoControllore(){
        super("Twixi","Lasciatemi andare in pensione...");
    }
    
    public int Controlla(int n,boolean m){
        if(m==true){
            switch (n){
                case 1:
                    return 0;
                case 2:
                    return 2;
                case 3:
                    return 10;
                case 4:
                    return 15;
                }
        }
        else{
            switch (n){
                case 1:
                    return 0;
                case 2:
                    return 0;
                case 3:
                    return 3;
                case 4:
                    return 5;
                }
        }
        return 0;
    }
}
