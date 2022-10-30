package faktoriyelhesaplayanprog;
import java.util.Scanner;
import java.math.*;

public class FaktoriyelHesaplayanProg {
    public static void main(String[] args) {
        int kombinasyon=1,n=1,r=1,bir=1,iki=1,uc=1;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("n giriniz:");
        n=input.nextInt();
        
        System.out.println("r giriniz:");
        r=input.nextInt();
        
        for(int i=1;i<=n;i++){
            bir=bir*i;
        }
        for(int i=1;i<=r;i++){
            iki=iki*i;
        }
        for(int i=1;i<=(n-r);i++){
            uc=uc*i;
        }
        kombinasyon=(bir)/((iki)*(uc));
        System.out.println("kombinasyon:"+kombinasyon);
       
    }
    
}
