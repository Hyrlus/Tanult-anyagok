package kutyak;

public class KutyaNevek {
   private int id;
   private String nev;

    public KutyaNevek(int id, String nev) {
        this.id = id;
        this.nev = nev;
    }

    public int getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    @Override
    public String toString() {
        return "KutyaNevek{" + "id=" + id + ", nev=" + nev + '}';
    }
   
   
}
