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
public class Giocattolo {
    private int qualità;
    private String nome;
    private Materiale mat;
    Random rdn=new Random();
    
    public Giocattolo(int q,String n,Materiale m){
        this.qualità=q;
        this.nome=n;
        this.mat=m;
    }
    
    public String sceltaPacco(){
        int r=rdn.nextInt(3);
        if(r==0){
            return "/crisimimis/Immagini/regalo1.png";
        }
        else if(r==1){
            return "/crisimimis/Immagini/regalo2.png";
        }
        else{
            return "/crisimimis/Immagini/regalo3.png";
        }
    }
    
    @Override
    public String toString(){
        return "Questo giocattolo e "+nome+" il suo materiale e"+mat+" la sua qualita e "+qualità;
    }
}
