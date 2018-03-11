/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import exceptii.CnpInvalidException;
import exceptii.NrTelefonInvalidException;
import exceptii.NumeInvalidException;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author lili
 */
public class Abonat implements Serializable {

    private String nume, prenume, cnp, telefon;

    public Abonat(String nume, String prenume, String cnp, String telefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.telefon = telefon;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setNume(String numeNou) {
        this.nume = numeNou;
    }

    public void setPrenume(String prenumeNou) {
        this.prenume = prenumeNou;
    }

    public void setCNP(String cnpNou) {
        this.cnp = cnpNou;
    }

    public void setTelefon(String telefonNou) {
        this.cnp = telefonNou;
    }

// constructor
    public static Abonat getInstance(String nume, String prenume, String cnp, String telefon) {
        if (!valideazaNume(nume)) {
            throw new NumeInvalidException("Introdu nume!");
        }
        if (!valideazaPrenume(prenume)) {
            throw new NumeInvalidException("Introdu prenume!");
        }
        if (!valideazaCnp(cnp)) {
            throw new CnpInvalidException("CNP-ul trebuie sa contina doar cifre!");
        }
        if (NrTel.getInstance(telefon) == null) {
            throw new NrTelefonInvalidException("Nr-ul de telefon trebuie sa contina doar cifre!");
        }
        return new Abonat(nume, prenume, cnp, telefon);
    }
    
    // metode validari
    private static boolean valideazaNume(String nume) {
        if (nume == null || nume.length() < 2) {
            System.out.println("Nume invalid.");
            return false;
        }
        return true;
    }

    private static boolean valideazaPrenume(String prenume) {
        if (prenume == null || prenume.length() < 2) {
            System.out.println("Prenume invalid");
            return false;
        }
        return true;
    }

    private static boolean valideazaCnp(String cnp) {
        if (!areLitere(cnp)) {
            System.out.println("CNP-ul trebuie sa contina doar cifre");
            return false;
        }
        if (cnp == null || cnp.length() < 12) {
            System.out.println("CNP invalid, prea putine caractere");
            return false;
        }
        return true;
    }

    public static boolean areLitere(String s) {
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (!Character.isDigit(c)) {
                // System.out.println("are cifre");
                return false;
            }
        }
        return true;
    }

    // metode ordonari
    @Override
    public String toString() {
        return nume + " " + prenume + ", CNP: " + cnp + ", nr.Tel: " + NrTel.getInstance(telefon);
    }

    public static void main(String[] args) {
// teste
        Scanner s = new Scanner(System.in);
        System.out.println("Introdu numele");
        String nume = s.nextLine();
        System.out.println("Introdu prenumele");
        String prenume = s.nextLine();
        System.out.println("Introdu cnp");
        String cnp = s.nextLine();
        System.out.println("Introdu nr de telefon");
        String telefon = s.nextLine();

        Abonat a = Abonat.getInstance(nume, prenume, cnp, telefon);
        if (a == null) {
            System.out.println("Ups, persoana nu a fost creata");
        } else {
            System.out.println("Abonat inregistrat astfel: " + a.toString());
        }
    }

}
