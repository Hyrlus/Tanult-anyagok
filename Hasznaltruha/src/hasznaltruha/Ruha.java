package hasznaltruha;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diak
 */
public class Ruha {
    private String Tipus;
    private String Nem;
    private int Meret;
    private boolean Szinhiba;
    private boolean Szakadas;
    private boolean Folt;
    private boolean KinyultE;

    public Ruha(String Tipus, String Nem, int Meret, boolean Szinhiba, boolean Szakadas, boolean Folt, boolean KinyultE) {
        this.Tipus = Tipus;
        this.Nem = Nem;
        this.Meret = Meret;
        this.Szinhiba = Szinhiba;
        this.Szakadas = Szakadas;
        this.Folt = Folt;
        this.KinyultE = KinyultE;
    }

    public String getTipus() {
        return Tipus;
    }

    public String getNem() {
        return Nem;
    }

    public int getMeret() {
        return Meret;
    }

    public boolean isSzinhiba() {
        return Szinhiba;
    }

    public boolean isSzakadas() {
        return Szakadas;
    }

    public boolean isFolt() {
        return Folt;
    }

    public boolean isKinyultE() {
        return KinyultE;
    }

    @Override
    public String toString() {
        return "Ruha{" + "Típus = " + Tipus + ", Nem = " + Nem + ", Méret = " + Meret + ", Színhiba = " + Szinhiba + ", Szakadás = " + Szakadas + ", Folt = " + Folt + ", KinyultE=" + KinyultE + '}';
    }
    
    
    
    
}
