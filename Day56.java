package Day56;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int jumlah = input.nextInt();
        
        for(int i = 1; i <= jumlah; i++){
            for(int j = 1; j < jumlah;  j++){
                System.out.print("o  ");
            }
          System.out.println("o  ");  
        }
        
    }
    
}
