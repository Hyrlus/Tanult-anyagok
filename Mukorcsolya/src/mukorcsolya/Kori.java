package mukorcsolya;

public class Kori {
    private String Nev;
    private String Orszag;
    private double Technikai;
    private double Komponens;
    private int Levonas;

    public Kori(String Nev, String Orszag, double Technikai, double Komponens, int Levonas) {
        this.Nev = Nev;
        this.Orszag = Orszag;
        this.Technikai = Technikai;
        this.Komponens = Komponens;
        this.Levonas = Levonas;
    }

    public String getNev() {
        return Nev;
    }

    public String getOrszag() {
        return Orszag;
    }

    public double getTechnikai() {
        return Technikai;
    }

    public double getKomponens() {
        return Komponens;
    }

    public int getLevonas() {
        return Levonas;
    }

    @Override
    public String toString() {
        return Nev + ", " + Orszag + ", Technikai = " + Technikai + ", Komponens = " + Komponens + ", Levonás = " + Levonas ;
    }
    
    
    
    
    
}
