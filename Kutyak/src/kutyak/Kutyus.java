package kutyak;

public class Kutyus {
   
    private int id;
    private int fajta_id;
    private int nev_id;
    private int eletkor;
    private String datum;

    public Kutyus(int id, int fajta_id, int nev_id, int eletkor, String datum) {
        this.id = id;
        this.fajta_id = fajta_id;
        this.nev_id = nev_id;
        this.eletkor = eletkor;
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public int getFajta_id() {
        return fajta_id;
    }

    public int getNev_id() {
        return nev_id;
    }

    public int getEletkor() {
        return eletkor;
    }

    public String getDatum() {
        return datum;
    }

    @Override
    public String toString() {
        return "Kutyus{" + "id=" + id + ", fajta_id=" + fajta_id + ", nev_id=" + nev_id + ", eletkor=" + eletkor + ", datum=" + datum + '}';
    }
    
    
}
