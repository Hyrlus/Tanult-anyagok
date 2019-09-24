package mukorcsolya;

import java.util.ArrayList;
import java.util.Scanner;

public class Mukorcsolya {
    
public static ArrayList <Kori> rovid ;
public static ArrayList <Kori> donto ;
public static ArrayList <String> orszagok;
public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       Verseny vs = new Verseny();
       rovid = vs.FajlBeolvasas("rovidprogram.csv" );
       donto = vs.FajlBeolvasas("donto.csv");
                System.out.println("A rövidprogramban elindult versenyzők száma:"+ rovid.size());
        if(vs.Magyar(donto)){
            System.out.println("Van magyar versenyző a döntőben!");
        
        }
        else{
            System.out.println("Nincs magyar versenyző a döntőben!");
        
        }
        System.out.println(vs.OsszpontSzam("Kaetlyn OSMOND"));
        
        System.out.println("Kérem adjon meg egy nevet:");
        String nev = sc.nextLine();
        if (!vs.Versenyzo(nev)) {
            System.out.println("Nincs ilyen versenyző!");
        }
        System.out.println("Az adott versenyző összpontszáma: "+vs.OsszpontSzam(nev));
        System.out.println("");
        orszagok = vs.OrszagLista();
        for(String s : orszagok){
        
            System.out.println(s);
        }
    }
    
}
