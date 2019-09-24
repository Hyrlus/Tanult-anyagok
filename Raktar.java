
package raktar;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Raktar {
    
 public static ArrayList <alkohol> Pia=new ArrayList<alkohol>();
  public static ArrayList <String> tipusuk=new ArrayList<String>();
    public static void fajlOlvasas(String fajlNev){
        
        try{
        BufferedReader olvas= new BufferedReader (new InputStreamReader(new FileInputStream(fajlNev),"UTF-8"));
        
        String elsoSor=olvas.readLine();
        String sor=olvas.readLine();
        while(sor!=null)
        {
        
        String[] st=sor.split(";");
        String nev=st[0];
        String fajta=st[1];
        double darab=Double.parseDouble(st[2]);
        int egysegar=Integer.parseInt(st[3]);

        
        Pia.add(new alkohol(nev, fajta, darab, egysegar));
        sor=olvas.readLine();
        }
            for(alkohol p: Pia){
                System.out.println(p);
            }
        }
        catch(IOException hiba){
            System.err.println("Hiba: "+hiba);                                       
        }            
    }
    
    //1.Írjunk metódust, mely visszaadja hogy milyen típusú alkoholos italok vannak a „raktárunkban”
    public static void tipalk(){
       for(alkohol p: Pia){
           if(!tipusuk.contains(p.getFajta())){
               tipusuk.add(p.getFajta());
           }
       }
       for (String s:tipusuk){
           System.out.println(s);
       }
    }
    
    //2.Számoljuk meg, hogy egyes alkoholfajákból mennyi van készleten!
    public static void feladatketto(){
        for (String s:tipusuk){
            int db=0; 
            for(alkohol p: Pia){
                if (s.equals(p.getFajta())){
                    db+=p.getDarab();
                }
            }
            System.out.println(s+"-bol összesen ennyie van: "+db);
        }
    }
    
    //3.Számoljuk meg mennyi a raktárban lévő alkoholok összértéke!
    public static int raktaralk(){
            int piadbSzama=0;
                for(alkohol p: Pia){
                    piadbSzama+=p.getDarab();
            }  
                return piadbSzama;
    }
    
    //4.Kérjünk be a felhasználótól egy alkoholtípust, és hogy mennyit szeretne vásárolni belőle, majd írjuk ki egy másik fájlba, a vásárolni kívánt tételeket és a végösszeget!
    public static int mennyiseg(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Kérem adja meg a mennyiséget!");
    int db=sc.nextInt();
    return db;    
    }
    public static int Tipus(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Kérem adja meg a mennyiséget!");
    String tipe=sc.nextLine();
    return tipe;    
    }
    
    //5.Írjuk ki a legdrágább alkohol márkáját
  
    
    public static void main(String[] args) {
        fajlOlvasas("raktar.txt");
        tipalk();                                                           //1 feladat
        feladatketto();                                                     //2 feladat
        System.out.println("Raktár alkoholok száma: "+raktaralk());         //3 feladat
        int db=mennyiseg();
    }
    
}
