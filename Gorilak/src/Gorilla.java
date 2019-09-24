/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diak
 */
public class Gorilla {
    private String nev;
    private int eletkor;
    private double suly;
    private String nem;
    private int utodok;

    public Gorilla(String nev, int eletkor, double suly, String nem, int utodok) {
        this.nev = nev;
        this.eletkor = eletkor;
        this.suly = suly;
        this.nem = nem;
        this.utodok = utodok;
    }

    public String getNev() {
        return nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public double getSuly() {
        return suly;
    }

    public String getNem() {
        return nem;
    }

    public int getUtodok() {
        return utodok;
    }

    @Override
    public String toString() {
        return "Gorilla{" + "Név = " + nev + ", Életkor = " + eletkor + ", Súly = " + suly + ", Nem = " + nem + ", Utódok = " + utodok + '}';
    }
    
    
    
    
}
