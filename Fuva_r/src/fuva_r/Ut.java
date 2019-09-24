/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuva_r;

/**
 *
 * @author Diak
 */
public class Ut {

    public Ut(int azonosito, String ido, int idotartam, double tavolsag, double viteldij, double borravalo, String fizetes) {
        this.azonosito = azonosito;
        this.ido = ido;
        this.idotartam = idotartam;
        this.tavolsag = tavolsag;
        this.viteldij = viteldij;
        this.borravalo = borravalo;
        this.fizetes = fizetes;
    }

    public int getAzonosito() {
        return azonosito;
    }

    public String getIdo() {
        return ido;
    }

    public int getIdotartam() {
        return idotartam;
    }

    public double getTavolsag() {
        return tavolsag;
    }

    public double getViteldij() {
        return viteldij;
    }

    public double getBorravalo() {
        return borravalo;
    }

    public String getFizetes() {
        return fizetes;
    }

    @Override
    public String toString() {
        return "Ut{" + "azonsoito=" + azonosito + ", ido=" + ido + ", idotartam=" + idotartam + ", tavolsag=" + tavolsag + ", viteldij=" + viteldij + ", borravalo=" + borravalo + ", fizetes=" + fizetes + '}';
    }
    private int azonosito;
   private String ido;
   private int idotartam;
   private double tavolsag;
   private double viteldij;
   private double borravalo;
   private String fizetes;
    
}
