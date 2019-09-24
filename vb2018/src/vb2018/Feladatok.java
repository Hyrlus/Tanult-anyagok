
package vb2018;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Feladatok {
    
    private ArrayList<Stadionok> stadion = new ArrayList<Stadionok>();
    String nev;
    public Feladatok(){
    
    FajlBeolvas();
    Harmas();
    Negyes();
    Otos();
    Hatos();
    Hetes();
    Nyolcas();
    Kilences();
    }
    private void FajlBeolvas(){
        try{
        
        BufferedReader olvas = new BufferedReader(new InputStreamReader 
        (new FileInputStream("vb2018.txt")));
        
         String elsoSor = olvas.readLine();
         String sor = olvas.readLine();
         
         while(sor != null){
         
             String [] st = sor.split(";");
             int ferohely = Integer.parseInt(st[3]);
             stadion.add (new Stadionok(st[0],st[1],st[2],ferohely));
             sor = olvas.readLine();
         }
            for (Stadionok stadionok : stadion) {
                System.out.println(stadion);
            }
        }
        catch(IOException e){System.err.println("Hiba");}
        
    
    }
    
    public void Harmas(){
    
        System.out.println(stadion.size()+" ennyi stadionba játszottak!");
    
    }
    public void Negyes(){
    
    int min = stadion.get(0).getFerohely();
    int index = 0;
        for (int i = 0; i < stadion.size(); i++) {
            if (min > stadion.get(i).getFerohely()) {
               min = stadion.get(i).getFerohely();
               index =i;
            }
        }
        System.out.println("4.feladat: A legkevesebb férőhely\n"
                + "Város:"+stadion.get(index).getVaros()+
                "\nStadion neve:"+stadion.get(index).getNev1()+
                "\nFérőhely:"+stadion.get(index).getFerohely());
    }
    public void Otos(){
    
    double ossz =0;
        for (Stadionok stadionok : stadion) {
           ossz += stadionok.getFerohely();
        }
        System.out.printf("5.feladat: Az átlagos férőhelyszám: %.1f" ,ossz/stadion.size());
        System.out.println("");
        //%.1f átlagolás(formázott ki íratás) printf!!, .1 egy tizedes jegyet ír ki
    }
    public void Hatos(){
    
    int db =0;
        for (Stadionok stadionok : stadion) {
            if (!stadionok.getNev2().equals("n.a.")) {
                db++;
            }
        }
        System.out.println("6.feladat: Két néven is ismert stadionok száma: "+db);
    
    }
    public void Hetes(){
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("7.feladat: kérem a város nevét");
            nev =sc.next();
            
        } 
        while (nev.length() < 3);
         
    }
    public void Nyolcas(){
    
    int i =0;
        while (i< stadion.size() && !stadion.get(i).getVaros().toLowerCase().equals(nev.toLowerCase()) ) {            
            i++;
        }
    
        if (i < stadion.size()) {
            System.out.println("8.feladat A megadott város VB helyszin!");
        }
        else{
        
            System.out.println("8.feladat A megadott város nem VB helyszin!");
        }
    }
    public void Kilences(){
    //hozzunk létre egy halmazt
    TreeSet <String> halmaz = new TreeSet<String>();
        for (Stadionok stadionok : stadion) {
            halmaz.add(stadionok.getVaros());
        }
        for (String string : halmaz) {
            System.out.println(string);
        }
        //%d formázott ki íratás
        System.out.printf("9.feladat: %d különböző városban voltak mérkőzések.",halmaz.size());
    }
}
