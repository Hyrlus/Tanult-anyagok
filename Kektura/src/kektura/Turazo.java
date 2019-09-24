package kektura;

public class Turazo {
    private String nev;
    private String vegpontN;
    private double hossz;
    private int emelkedes;
    private int lejto;
    private String pecset;

    public Turazo(String nev, String vegpontN, double hossz, int emelkedes, int lejto, String pecset) {
        this.nev = nev;
        this.vegpontN = vegpontN;
        this.hossz = hossz;
        this.emelkedes = emelkedes;
        this.lejto = lejto;
        this.pecset = pecset;
    }

    public String getNev() {
        return nev;
    }

    public String getVegpontN() {
        return vegpontN;
    }

    public double getHossz() {
        return hossz;
    }

    public int getEmelkedes() {
        return emelkedes;
    }

    public int getLejto() {
        return lejto;
    }

    public String getPecset() {
        return pecset;
    }

    

    @Override
    public String toString() {
        return nev + ", " + vegpontN + ", " + hossz + ", " + emelkedes + ", " + lejto + ", " +pecset;
    }
    
}
