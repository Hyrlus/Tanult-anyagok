/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasznaltruha;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diak
 */
public class Hasznaltruha {

    public static ArrayList<Ruha> ruhak = new ArrayList<Ruha>();
    public static ArrayList<Ruha> jomeret = new ArrayList<Ruha>();
    
    public static void FajlBeolvasas(String fajlnev){
    try{
    BufferedReader olvas = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev ),"UTF-8"));
    
    String elsoSor = olvas.readLine();
    String sor = olvas.readLine();
         while(sor!=null){
                String [] st = sor.split(";");
                 String Tipus = st[0];
                 String Nem= st[1];
                 int Meret = Integer.parseInt(st[2]);
                 boolean Szinhiba = st[3].equals("igen")? true:false;
                 boolean Szakadas = st[4].equals("igen")? true:false;
                 boolean Folt = st[5].equals("igen")? true:false;
                 boolean KinyultE= st[6].equals("igen")? true:false; 

                 ruhak.add(new Ruha(Tipus,Nem,Meret,Szinhiba,Szakadas,Folt,KinyultE));

                 sor = olvas.readLine();
            
    }
        for(Ruha r:ruhak){
             System.out.println(r);                  
            }    
    }
    catch(IOException hiba){
        System.err.println("Hiba:"+hiba);
    }
        
    }
    
    public static String Osztalyoz(Ruha r){
        String osztaly="";
        int db=0;    
            if (r.isFolt()) {
            db++;
            }
            if (r.isKinyultE()) {
            db++;
            }
            if (r.isSzakadas()) {
            db++;
            }
            if (r.isSzinhiba()) {
            db++;
            }
            
            switch(db){
                case 0:
                case 1: osztaly="kivalo";break;
                case 2: osztaly="masod osztalyu";break;
                case 3: osztaly="harmad osztalyu";break;    
                default: osztaly="selejt";break;
            }
        return osztaly;
    }
    
    public static void MeretesRuhak (int meret){
        for(Ruha r: ruhak){
            if (r.getMeret() == meret) {
                jomeret.add(r);
            }
        }
        System.out.println(meret+ "-es ruhák közül ezek vannak készleten: ");
        for(Ruha r: jomeret){
            System.out.println(r);        
        }
    
    }
    
    
    public static int Meret(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a méretét!");
    int size = sc.nextInt();
    
    
    return size;
    }
    
    
            
    public static void main(String[] args) {
    
        FajlBeolvasas("hasznaltruci.txt");
        System.out.println("");
        for (Ruha r: ruhak) {
            System.out.println(Osztalyoz(r));
        }
        int size = Meret();
        MeretesRuhak(size);
        
    }
    
}
