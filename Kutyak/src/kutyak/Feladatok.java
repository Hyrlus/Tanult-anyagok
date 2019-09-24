package kutyak;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Feladatok {
  
    private ArrayList <KutyaNevek> nevek = new ArrayList <KutyaNevek>();
    private ArrayList <KutyaFajta> fajtak = new ArrayList <KutyaFajta>();
    private ArrayList <Kutyus> kutyusok = new ArrayList <Kutyus>();
    
    public void EgyesFeladat(){
    
    try{
        
        BufferedReader olvas = new BufferedReader(new InputStreamReader(new FileInputStream("KutyaNevek.csv")));
        String elsosor = olvas.readLine();
        String sor = olvas.readLine();
        while(sor != null){
            String[] st = sor.split(";");
            nevek.add(new KutyaNevek(Integer.parseInt(st[0]),st[1]));
            sor = olvas.readLine();
        }
        System.out.println("3.feladat: A kutyanevek száma: "+ nevek.size());
    }
    catch(FileNotFoundException e){
        System.out.println("Fájl nem található");
    }
    catch(IOException e){
        System.out.println("Hiba");
        
    }
    }
    public void NegyesFeladat(){
    try{
        BufferedReader olvas = new BufferedReader(new InputStreamReader(new FileInputStream("KutyaFajtak.csv")));
        String elsosor = olvas.readLine();
        String sor = olvas.readLine();
        while(sor != null){
            String[] st = sor.split(";");
            if(st.length < 2){
            fajtak.add(new KutyaFajta(Integer.parseInt(st[0]),st[1],st[2]));
            }
            else
            {
                fajtak.add(new KutyaFajta(Integer.parseInt(st[0]),st[1],""));
            }
            
            sor = olvas.readLine();
        }
    }
    catch(IOException e){System.out.println("Hiba");}
    }
    
    public void OtosoFeladat(){
    try{
        BufferedReader olvas = new BufferedReader(new InputStreamReader(new FileInputStream("Kutyak.csv")));
        String elsosor = olvas.readLine();
        String sor = olvas.readLine();
        while(sor != null){
            String[] st = sor.split(";");
              int id = Integer.parseInt(st[0]);
              int fajta_id = Integer.parseInt(st[1]);
              int nev_id = Integer.parseInt(st[2]);
              int eletkor = Integer.parseInt(st[3]);
              kutyusok.add(new Kutyus(id,fajta_id,nev_id,eletkor,st[4]));
              sor = olvas.readLine();
        }
    }
     catch(IOException e){System.out.println("Hiba");}  
    
    
    }
    public void HatosFeladat(){
    int ossz =0;
    for(Kutyus k:kutyusok){
        ossz += k.getEletkor();
    }
        System.out.println("6. feladat: A kutyák átlagéletkora: "+ossz/kutyusok.size());
    }
    public void HetesFeladat(){
    for(KutyaFajta kf : fajtak){
        int index = 0;
        for (int i = 0; i < kutyusok.size(); i++) {
            if(kutyusok.get(i).getEletkor() > kutyusok.get(index).getEletkor()) {
                index = i;
                index++;
            }
           
        }
        
        System.out.println("7.feladat: A legidősebb kutya: " + kutyusok.get(index).getEletkor() + " éves");
        int nev_Id = kutyusok.get(index).getNev_id();
        String Nev = nevek.get(nev_Id-1).getNev();
        int fajta_Id = kutyusok.get(index).getFajta_id();
        String Faj = fajtak.get(fajta_Id-1).getNev();
        System.out.println("Neve: " + Nev +"Fajtája: " + Faj);
    }
    
    
    }
    }


