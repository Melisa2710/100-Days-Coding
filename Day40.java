package Day40;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka1, angka2;
        
        System.out.print("masukkan angka terbesar : ");
        angka1 = input.nextInt();
        
        System.out.print("masukkan angka terkecil : ");
        angka2 = input.nextInt();
         
        for(int i=angka1; i>=angka2; i--){
            System.out.println("hasil = "+i);
        }
        
        
        
    }
    
}
