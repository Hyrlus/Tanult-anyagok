package tesztverseny;

/**
 *
 * @author Diak
 */
public class Versenyzok {
    
    private String Azonosito;
    private String Valasz;

    public Versenyzok(String Azonosito, String Valasz) {
        this.Azonosito = Azonosito;
        this.Valasz = Valasz;
    }

    public String getAzonosito() {
        return Azonosito;
    }

    public String getValasz() {
        return Valasz;
    }

    @Override
    public String toString() {
        return Azonosito + ", " + Valasz;
    }
    
    
    
    
    
}
