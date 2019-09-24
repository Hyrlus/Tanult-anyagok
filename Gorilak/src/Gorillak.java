
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Gorillak {
    
public static ArrayList<Gorilla> gorcsik=new ArrayList<Gorilla>();

public static void fajlOlvasas(String fajlNev) {
    try{
    BufferedReader olvas = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev),"UTF-8"));
    String elsoSor = olvas.readLine();
    String sor = olvas.readLine();
    while(sor!=null){
    String[]st =sor.split(";");
    String nev=st[0];
    int eletkor = Integer.parseInt(st[1]);
    double suly = Double.parseDouble(st[2]);
    String nem = st[3];
    int utodok =Integer.parseInt(st[4]);
    
    gorcsik.add(new Gorilla(nev,eletkor,suly,nem,utodok));
    sor=olvas.readLine();
    }
        for(Gorilla g: gorcsik){
            System.out.println(g);
        
        }
    }catch(IOException hiba){
    System.err.println("Hiba:"+hiba);
    }
    
    
}

public static int nostenyek(){

int nostenyekSzama = 0;
    for (Gorilla g: gorcsik) {
        if (g.getNem().equals("nosteny")) {
            nostenyekSzama++;
        }
    }

return nostenyekSzama;
}

public static int himekKolke(){
int kolkokSzama =0;

for(Gorilla g:gorcsik){

    if(g.getNem().equals("him")){
    
    kolkokSzama+=g.getUtodok();
    }

}

return kolkokSzama;
}
public static void rendezesEletkor(){

    for (int i = 0; i < gorcsik.size()-1; i++) {
        for (int j = i+1; j < gorcsik.size() ; j++) {
            if (gorcsik.get(i).getEletkor() > gorcsik.get(j).getEletkor()) {
                Gorilla csere=gorcsik.get(i);
                gorcsik.set(i,gorcsik.get(j));
                gorcsik.set(j, csere);
            }
        }
    }
    
    for (Gorilla g: gorcsik) {
        System.out.println(g);
    }



}
    
public static void main(String[] args) {
        
        Gorilla g = new Gorilla("Jenő",16,42.6,"him",5);
        
        Gorilla g2 = new Gorilla("Julcsu",14,30.5,"nosteny",3);
        
        System.out.println(g);
        System.out.println(g2);
        
        fajlOlvasas("gorilla.txt");
        System.out.println("A nőstény gorillák száma: "+nostenyek());
        System.out.println("A himek kölkének száma összesen: "+ himekKolke());
        rendezesEletkor();
    }
} 

