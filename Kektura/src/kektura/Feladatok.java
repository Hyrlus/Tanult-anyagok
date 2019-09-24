package kektura;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;

import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Feladatok {
    
    public ArrayList <Turazo> turaszakasz = new ArrayList<Turazo>();
    
    
    public void Fajlbeolvas(){
    try{
    BufferedReader olvas = new BufferedReader(new InputStreamReader(new FileInputStream("kektura.csv"),"UTF-8"));
    String elsoSor = olvas.readLine();
    String sor ;
    while((sor = olvas.readLine()) != null){
           
    
    String [] st = sor.split(";");
     String nev = st[0];
     String vegpontN= st[1];
     double hossz = Double.parseDouble(st[2].replace(",", "."));
     int emelkedes = Integer.parseInt(st[3]);
     int lejto = Integer.parseInt(st[4]);
     String pecset = st[5];
     turaszakasz.add(new Turazo(nev,vegpontN,hossz,emelkedes,lejto,pecset));
    
     
    }
     
     for(Turazo t: turaszakasz){
     
         System.out.println(t);
     
     }

    }
    catch(IOException e){System.out.println("Hiba"+e);}
    }
    
    public void HarmadikFeladat(){
        int db =0;
        for (int i = 0; i < turaszakasz.size(); i++) {
            db++;
        }
        
        System.out.println("3.feladat: Szakaszok száma: "+db+" db");
  
    
    }
    public void NegyedikFeladat(){
        double count =0;
        for(Turazo t: turaszakasz){
        
        count+= t.getHossz();
        }
        DecimalFormat df = new DecimalFormat(".000");
        System.out.println("4.feladat: A túra teljes hossza: "+ df.format(count) + " km");
    }
    
    public void OtosFeladat(){
        int min = 0;
        for (int i = 1; i < turaszakasz.size(); i++) {
            if (turaszakasz.get(i).getHossz() < turaszakasz.get(min).getHossz()) {
                min = i;
            }
        }
        System.out.println("5.feladat: A legrövidebb szakasz adatai:");
        System.out.println("\t Kezdet: " + turaszakasz.get(min).getNev());
        System.out.println("\t Vég: " + turaszakasz.get(min).getVegpontN());
        System.out.println("\t Távolság: " + turaszakasz.get(min).getHossz() +" km");
    
    }
    
    }
    
    

