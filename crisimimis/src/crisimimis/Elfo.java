/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

/**
 *
 * @author caibugatti.ruben
 */
public class Elfo {
    
    private String nome;
    int[] specialità=new int[5];
    protected String special;
    
    public Elfo(String n,int[] s,String spe){
        this.nome=n;
        for(int i=0;i<5;i++){
            this.specialità[i]=s[i];
        }
        this.special=spe;
    }
    
    public String special(){
        return special;
    }
}
