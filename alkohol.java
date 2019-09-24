package raktar;


public class alkohol {

    private String Nev;
    private String Fajta;
    private double Darab;
    private int Egysegar;
    
    //konstruktor
    public alkohol(String Nev, String Fajta, double Darab, int Egysegar) {
        this.Nev = Nev;
        this.Fajta = Fajta;
        this.Darab = Darab;
        this.Egysegar = Egysegar;
    }

    //getter
    public String getNev() {
        return Nev;
    }

    public String getFajta() {
        return Fajta;
    }

    public double getDarab() {
        return Darab;
    }

    public int getEgysegar() {
        return Egysegar;
    }

    //toString
    @Override
    public String toString() {
        return "alkohol{" + "Nev=" + Nev + ", Fajta=" + Fajta + ", Darab=" + Darab + ", Egysegar=" + Egysegar + '}';
    }

}
