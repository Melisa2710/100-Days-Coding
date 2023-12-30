package Day84;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int jmlh = input.nextInt();
        for(int i = 1; i <= jmlh; i++){
            for(int j = 1; j < i; j++){
                System.out.print("o  ");
            }
            System.out.println("o");
        }
        
    }
    
}
