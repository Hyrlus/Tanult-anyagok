/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuva_r;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Diak
 */
public class Feladatok {
    
    private ArrayList<Ut> utak = new ArrayList<Ut>();
    
    public Feladatok()
    {
    
    Beolvas();
        System.out.println("2.feladat: összesen "+utak.size()+" adat van az állományban");
        Negyes();
        System.out.println("");
        Fizetesnemek();
        OsszKm();
        LeghosszabbFuvar();
        FajlbaIras();
    }
    
    
    public void Beolvas()
    {
        try
        {
        BufferedReader r = new BufferedReader(new InputStreamReader (new FileInputStream("utasok.csv")));
        String elsoSor = r.readLine();
        String sor = r.readLine();
        while(sor!=null)
        {
            String []st = sor.split(";");
            
            int azonosito = Integer.parseInt(st[0]);
             String ido = st[1];
             int idotartam = Integer.parseInt(st[2]);
             double tavolsag = Double.parseDouble(st[3]);
             double viteldij=Double.parseDouble(st[4]);
             double borravalo=Double.parseDouble(st[5]);
             String fizetes = st[6];
             
             utak.add(new Ut(azonosito,ido,idotartam,tavolsag,viteldij,borravalo,fizetes));
             sor = r.readLine();
        }
            
            r.close();
        }
        catch(IOException e)
        {System.err.println("Hiba!"+e);}
    
    }
    
    public void Negyes()
    {
        int db =0;
        double ossz =0;
        for (Ut ut : utak) {
            if (ut.getAzonosito() == 6185) {
                db++;
                ossz+= ut.getViteldij();
            }
        }
        System.out.printf("4.feladat: Az össz bevéltele: %.2f, amit %d út során kapott " ,ossz,db);
    
    
    }
    public void Fizetesnemek()
    {
    HashMap<String,Integer> modok = new HashMap<String,Integer>();
        for (Ut ut : utak) {
            if (modok.containsKey(ut.getFizetes())) {
                modok.put(ut.getFizetes(), modok.get(ut.getFizetes())+1);
            }
            else{
            modok.put(ut.getFizetes(), 1);
            }
         }
        for(Map.Entry<String,Integer> entry: modok.entrySet()){
            System.out.println(entry.getKey()+ ": " + entry.getValue()+" fuvar");
        
        }
    }
    public void OsszKm()
    {
    double ossz =0;
        for (Ut ut : utak) {
            ossz+= ut.getTavolsag();
        }
        System.out.printf("6.feladat: az ossz megtett ut : %.2f",ossz);
        System.out.println("");
    
    }
    public void LeghosszabbFuvar()
    {
        double max = 0;
        Ut utacska = utak.get(0);
        for (Ut ut : utak) {
            if (max < ut.getIdotartam()) {
                max = ut.getIdotartam();
                utacska = ut;
            }
            
        }
        System.out.println(utacska);
    
    }
    public void FajlbaIras()
    {
        try
        {
        
            BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("kimenet.csv")));
            for (Ut ut : utak) {
                if (ut.getIdotartam() !=0 && ut.getTavolsag() == 0) {
                    wr.write(ut.toString());
                }
            }
        wr.close();
        }
        catch(IOException e)
        {System.out.println("hiba"+e);}
    
    
    }

    
}
