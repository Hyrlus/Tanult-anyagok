package mukorcsolya;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Verseny {

    
    
    public  ArrayList<Kori> FajlBeolvasas ( String fajlNev)
    {
        ArrayList<Kori> lista = new ArrayList<>();
        
        try{
            BufferedReader olvas = new BufferedReader(new InputStreamReader (new FileInputStream(fajlNev),"UTF-8"));
            String Elsosor = olvas.readLine();
            String sor = olvas.readLine();
            
            while(sor != null)
            {
            String [] st = sor.split(";");
            String Nev = st[0]; 
            String Orszag = st[1];
            double Technikai = Double.parseDouble(st[2]);
            double Komponens = Double.parseDouble(st[3]);
            int Levonas = Integer.parseInt(st[4]);
            
            lista.add(new Kori(Nev,Orszag,Technikai,Komponens,Levonas));
            sor=olvas.readLine();
            
            }
            Kiir(lista);
            olvas.close();
                    
        }
        catch(IOException e)
        {
            System.err.println("Hiba:"+e);
        
        }
        return lista;
    }
   public void Kiir(ArrayList<Kori> lista){
   
   for(Kori k : lista)
   {
       System.out.println(k);
   }
       System.out.println("");
   
   }
   public boolean Magyar(ArrayList<Kori> lista)
   {
   
   for(Kori k : lista)
   {
       if(k.getOrszag().equals("HUN"))
       {
       return true;
       }
       
   }
   return false;
   }
   
   public double OsszpontSzam(String Nev){
   double ossz = 0;
   
   for(Kori k: Mukorcsolya.rovid)
   {
    if(k.getNev().equals(Nev))
    {
    ossz = k.getKomponens()+k.getTechnikai() -k.getLevonas();
    }
   }
   for(Kori k: Mukorcsolya.donto)
    {
        if(k.getNev().equals(Nev))
        {
            ossz += k.getKomponens()+k.getTechnikai()-k.getLevonas();
        }
    }
   
   return ossz;
   }
   public boolean Versenyzo(String Nev)
   {
       for(Kori k: Mukorcsolya.rovid)
        
        {
            if(k.getNev().equals(Nev))
            {
                return true;
            }
        }
       return false;
   }
   
   public ArrayList <String> OrszagLista()
   {
       ArrayList <String> lista = new ArrayList<String>();
       for(Kori k: Mukorcsolya.donto)
            {
                if (!lista.contains(k.getOrszag())) {
                    lista.add(k.getOrszag());
                  
                    
                }
            }
              
       return lista;
   }
}
