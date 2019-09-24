/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vbgyak;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Hyrlus
 */
public class Feladatok {
    
    ArrayList<Stadion> stadionok = new ArrayList<>();
    String nev;
    public Feladatok(){
    
    FajlBeolvasas();
    Negyes();
    Otos();
    Hatos();
    Hetes();
    Nyolcas();
    Kilences();
    }
    
    private void FajlBeolvasas(){
    
        try {
            BufferedReader olvas = new BufferedReader(new InputStreamReader(new FileInputStream("vb2018.txt")));
            String elsoSor = olvas.readLine();
            String sor = olvas.readLine();
            while (sor != null) {
                String []st = sor.split(";");
                int ferohely = Integer.parseInt(st[3]);
                stadionok.add(new Stadion(st[0], st[1], st[2], ferohely));
                sor = olvas.readLine();
            }
            System.out.println("3.feladat: Stadionok száma: "+stadionok.size());
        } catch (Exception e) {
            System.out.println("Hiba:"+e);
        }
    
    }
    
    private void Negyes(){
    
    int min = stadionok.get(0).getFerohely();
    int index = 0;
    
        for (int i = 0; i < stadionok.size(); i++) {
            if (min > stadionok.get(i).getFerohely()) {
                min = stadionok.get(i).getFerohely();
                index = i;
            }
        }
        System.out.println("4.feladat: A legkevesebb férőhely: \n\tVáros: "+stadionok.get(index).getVaros()+"\n\tStadion neve: "+stadionok.get(index).getNev1()+"\n\tFérőhely: "+stadionok.get(index).getFerohely());
    }
    
    private void Otos(){
    
    double ossz =0;
        for (Stadion stadionok1 : stadionok) {
            ossz += stadionok1.getFerohely();
        }
        System.out.printf("5.feladat: Átlagos férőhelyszám: %.1f",ossz/stadionok.size());
        System.out.println("");
    }
    private void Hatos(){
    
    int db =0;
    
        for (Stadion stadionok1 : stadionok) {
            if (!stadionok1.getNev2().equals("n.a.")) {
                db++;
            }
        }
        System.out.println("6.feladat: Két néven is ismert stadionok száma: "+db);
    }
    
    private void Hetes(){
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("7.feladat: Kérem a város nevét: ");
            nev = sc.next();
        } while (nev.length() < 3);
        
    }
    private void Nyolcas(){
    
        int i =0;
        while (i < stadionok.size() && !stadionok.get(i).getVaros().toLowerCase().equals(nev.toLowerCase())) {            
            i++;
        }
        if (i < stadionok.size()) {
            System.out.println("8. feladat: A megadott város VB helyszín.");
        }
        else{
        
            System.out.println("8. feladat: A megadott város nem VB helyszín.");
        }
    }
    private void Kilences(){
        TreeSet<String> halmaz = new TreeSet<>();
        for (Stadion stadionok1:stadionok) {
            halmaz.add(stadionok1.getVaros());
        }
        System.out.printf("9.feladat: %d különböző városban voltak mérkőzések.",halmaz.size());
    }
}
