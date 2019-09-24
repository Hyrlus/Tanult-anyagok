package tesztversenygyak;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Verseny {
    private ArrayList<Versenyzok> versenyzok = new ArrayList<Versenyzok>();
    private String Megoldokulcs;
    private Scanner sc = new Scanner(System.in);
    public void EgyesFeladat(){
        System.out.println("1.feladat: Fájl beolvasás");
        }
    public void Fajlbolvasas(){
    
        try {
                BufferedReader olvas = new BufferedReader(new InputStreamReader
        (new FileInputStream("valaszok.txt"),"UTF-8"));
                Megoldokulcs = olvas.readLine();
                String sor = olvas.readLine();
                while (sor != null) {
                String [] st = sor.split(" ");
                versenyzok.add(new Versenyzok(st[0], st[1]));
                sor = olvas.readLine();
                
            }
            System.out.print("2. feladat: a vetélkedőn "+versenyzok.size()+" versenyző indult.");
        } catch (IOException e) {
            System.err.println("Hiba: "+e);
        }
        System.out.println("");
    }
    
    
    public void HarmasFeladat()
    {
        System.out.print("3.felada: A versenyző azonosítója =  ");
        String azonosito = sc.next();
        
        int i = 0;
        while (i < versenyzok.size() && !versenyzok.get(i).getNev().equals(azonosito)) {
                        i++;
        }
        System.out.print(azonosito);
        if (i < versenyzok.size()) {
            System.out.println(versenyzok.get(i).getValaszok()+" (a versenyző válasza) ");
        }
        else{
        
            System.out.println("Nincs ilyen versenyző!");
        }
        System.out.println("4.feladat:");
        NegyesFeladat(i);
    }
    public void NegyesFeladat(int azonosito)
    {
        System.out.print(Megoldokulcs+"(a helyes megoldás)\t\n");
        for (int i = 0; i < versenyzok.get(i).getValaszok().length(); i++) {
            if (versenyzok.get(azonosito).getValaszok().charAt(i)==Megoldokulcs
                    .charAt(i)) {
                
                System.out.print("+");
                
            }
            
            else
            {
                System.out.print(" ");
                
            }
            
        }
        System.out.print("(a versenyző helyes válaszai)");
        System.out.println("");
    }
    public void OtosFeladat()
    {
        System.out.print("5.feladat: A feladat sorszáma = ");
        int feladatSzam = sc.nextInt();
        int helyes =0;
        for (int i = 0; i < versenyzok.size(); i++) {
            if (versenyzok.get(i).getValaszok().charAt(feladatSzam-1)==Megoldokulcs.charAt(feladatSzam-1)) {
                helyes++;
            }
        }
        double atlag = helyes*1.0/versenyzok.size()*100;
        int n = 2;
        double z = Math.pow(10, n);
        atlag = Math.round(atlag*z)/z;
        System.out.println("A feladatra "+helyes+" fő, a versenyzők "+atlag+"%-a adott helyes választ.");
       
        
    }
    public void HetesFeladat()
    {
    
        int index =0;
        for (int i = 0; i < versenyzok.get(i).getValaszok().length(); i++) {
            if (versenyzok.get(i).getValaszok().charAt(i) >= Megoldokulcs.charAt(i)) {
                index++;
            }
            System.out.println("7.feladat: A verseny legjobbjai : \t\n1. díj("+index+"):"+versenyzok.get(index).getNev());
        }
    
    }
    
}
