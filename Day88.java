package Day88;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        int hasil = angka;
        System.out.print(angka + "! =");
        for(int i = angka; i > 0; i--){
            System.out.print(i);
            if(i > 1){
                System.out.print(" x ");
            }
            if(angka != i){
                hasil *= i;
            }
        }
        System.out.println("\n   = "+hasil);
    }
    
}
