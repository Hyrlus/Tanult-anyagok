package tesztversenygyak;

public class Versenyzok {

    public Versenyzok(String Nev, String Valaszok) {
        this.Nev = Nev;
        this.Valaszok = Valaszok;
    }

    public String getNev() {
        return Nev;
    }

    public String getValaszok() {
        return Valaszok;
    }

    @Override
    public String toString() {
        return Nev + " " + Valaszok;
    }
    private String Nev;
    private String Valaszok;
}
