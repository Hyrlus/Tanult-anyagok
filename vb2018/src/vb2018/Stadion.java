package vb2018;

public class Stadion {

    public Stadion(String varos, String nev1, String nev2, int ferohely) {
        this.varos = varos;
        this.nev1 = nev1;
        this.nev2 = nev2;
        this.ferohely = ferohely;
    }

    public String getVaros() {
        return varos;
    }

    public void setVaros(String varos) {
        this.varos = varos;
    }

    public String getNev1() {
        return nev1;
    }

    public void setNev1(String nev1) {
        this.nev1 = nev1;
    }

    public String getNev2() {
        return nev2;
    }

    public void setNev2(String nev2) {
        this.nev2 = nev2;
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }
    private String varos;
    private String nev1;
    private String nev2;
    private int ferohely;

    @Override
    public String toString() {
        return "Stadion{" + "varos=" + varos + ", nev1=" + nev1 + ", nev2=" + nev2 + ", ferohely=" + ferohely + '}';
    }
}
