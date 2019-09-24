
package haromszog;

import java.util.Scanner;


public class Haromszog {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a háromszög oldalait:");
        System.out.print("A:");
        int a = sc.nextInt();
        System.out.print("B:");
        int b = sc.nextInt();
        System.out.print("C:");
        int c = sc.nextInt();
        
        if (a+b > c && a+c > b && b+c > a) {
            System.out.println("Kerület: "+ (a+b+c)+"");
        }
        else{
            System.out.println("a háromszög nem szerkezthető!");
        }
        System.out.println("kérem adja meg a terület ,kerület");
        char cc = sc.nextLine().charAt(0);
        
        if (cc =='T') {
            
        }else if (cc=='K'){}
        
    }
    
}
