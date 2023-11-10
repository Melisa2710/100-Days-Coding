package Day33;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
     
        Scanner input = new Scanner (System.in);

        System.out.println(" masukkan angka 1: "  );
        int angka1 = input.nextInt();
        
        System.out.println("masukkan angka 2: " );
        int angka2 = input.nextInt();
        
        if (angka1 > angka2){
          System.out.print("angka 1 lebih besar");
       }else{
          System.out.print("angka 2 lebih besar");
      }
        
        
    }
    
}
        
        
    
    
