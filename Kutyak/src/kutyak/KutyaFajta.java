package kutyak;

public class KutyaFajta {
  
    private int id;
    private String nev;
    private String eredetiNev;

    public KutyaFajta(int id, String nev, String eredetiNev) {
        this.id = id;
        this.nev = nev;
        this.eredetiNev = eredetiNev;
    }

    public int getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public String getEredetiNev() {
        return eredetiNev;
    }

    @Override
    public String toString() {
        return "KutyaFajta{" + "id=" + id + ", nev=" + nev + ", eredetiNev=" + eredetiNev + '}';
    }
    
    
    
}
