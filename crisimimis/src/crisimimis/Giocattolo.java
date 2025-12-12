/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

/**
 *
 * @author caibugatti.ruben
 */
public class Giocattolo {
    private int qualità;
    private String nome;
    private Materiale mat;
    
    public Giocattolo(int q,String n,Materiale m){
        this.qualità=q;
        this.nome=n;
        this.mat=m;
    }
    
    @Override
    public String toString(){
        return "Questo giocattolo e "+nome+" il suo materiale e"+mat+" la sua qualita e "+qualità;
    }
}
