/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisimimis;

/**
 *
 * @author caibugatti.ruben
 */
public enum Materiale {
    PLASTICA,
    LEGNO,
    FERRO,
    CRISTALLODINEVE,
    FRAMMENTOMAGICO;
    
    public static Materiale tipoMat(String m){
        switch (m){
            case "PLASTICA":
                    return PLASTICA;
            case "LEGNO":
                    return LEGNO;
            case "FERRO":
                    return FERRO;
            case "CRISTALLODINEVE":
                    return CRISTALLODINEVE;
            case "FRAMMENTOMAGICO":
                    return FRAMMENTOMAGICO;
        }
        return PLASTICA;
    }
}
