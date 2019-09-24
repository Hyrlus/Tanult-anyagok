package tesztverseny;

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
public class Verseny {
    Scanner sc = new Scanner(System.in);
    private ArrayList <Versenyzok> versenyzo = new ArrayList<Versenyzok>();
    private ArrayList <Integer> pontszamok = new ArrayList<Integer>();
    private String Megoldokulcs;
    public void FajlBeolvasas()
    {       try{
                BufferedReader olvas = new BufferedReader(new InputStreamReader(new FileInputStream("valaszok.txt"),"UTF-8"));
                Megoldokulcs = olvas.readLine();
                String sor = olvas.readLine();
                while(sor!=null)
                    {
                       String [] st = sor.split(" ");
                       versenyzo.add(new Versenyzok(st[0],st[1])); 
                        
                        sor=olvas.readLine();
                        
                    }
                System.out.println("Első feladat:");
                for(Versenyzok v: versenyzo)
                {
                    System.out.println(v);
                }
        
            }
            catch(IOException hiba)
            {
                System.err.println("Hiba:" +hiba);
            }
    
    }
    public void MasodikFeladat()
    {
        System.out.println("2. feladat \r\nA vetélkedőn " + versenyzo.size() + " ember indult.");
    
    }
    
    public void HarmadikFeladat()
    {
        System.out.println("3. Feladat: \r\nKérem adjon meg egy azonosítót:");
        String azonosito = sc.nextLine();
        int i = 0;
        while(i < versenyzo.size() && !versenyzo.get(i).getAzonosito().equals(azonosito))
        {
            i++;        
        }
        if (i< versenyzo.size()) {
            System.out.println(versenyzo.get(i).getValasz() + " (a versenyző válasza).");
        }
        else
        {
            System.out.println("Nincs ilyen versenyző!");
        }
        NegyesFeladat(i);
    }
    public void NegyesFeladat(int index)
    {
        System.out.println(Megoldokulcs + "A helyes válaszok");
        for (int i = 0; i < versenyzo.get(index).getValasz().length(); i++) {
            if (versenyzo.get(index).getValasz().charAt(i) == Megoldokulcs.charAt(i)) {
                System.out.print(" + ");
            }else
                {
                        System.out.print(" ");
                }
        }
        
    }
    public void OtosFeladat()
    {   
        System.out.println("5. feladat");
        System.out.println("Kérem adja meg a feladat sorszámát: ");
        int sorszam = sc.nextInt();
        int helyesValaszokSzama =0;
        for(Versenyzok v : versenyzo)
        {
            if (v.getValasz().charAt(sorszam-1)== Megoldokulcs.charAt(sorszam-1)) {
                helyesValaszokSzama++;
            }
        
        }
        double atlag = helyesValaszokSzama*1.0/versenyzo.size()*100;
        atlag = Math.round(atlag/100)*100;
        System.out.println("A feladatra " + helyesValaszokSzama +  " fő,  a versenyzők " + atlag + "%-a adott helyes választ.");
    }
    
    public void HatosFeladat()
    {
    
    
    }
}
