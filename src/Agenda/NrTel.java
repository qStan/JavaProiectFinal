/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import static Agenda.Abonat.areLitere;

/**
 *
 * @author lili
 */
public class NrTel {
    private String nrTel;
    
    private NrTel(String nrTel){
        this.nrTel = nrTel;
    }
    
    public static NrTel getInstance(String nrTel){
        if(!valideazaNrTel(nrTel)){
            System.out.println("Nr de telefon invalid");
            return null;
        }
        return new NrTel(nrTel);
    }
    
        private static boolean valideazaNrTel(String NrTel) {
        if (!areLitere(NrTel)) {
            System.out.println("Numarul de telefon trebuie sa contina doar cifre");
            return false;
        }
        if (NrTel == null || NrTel.length() < 10) {
            System.out.println("Numarul de telefon trebuie sa aiba 10 cifre ");
            return false;
        }
        return true;
    }
        @Override
    public String toString() {
        return nrTel;
    }
}
