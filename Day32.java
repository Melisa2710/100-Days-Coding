package Day32;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //membuat program untuk menjumlahkan angka, yang dimana angka awal dan akhir di tentukan oleh keyboard
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai (A): ");
        int A = input.nextInt();
        
        System.out.print("Masukkan nilai (B): ");
        int B = input.nextInt();

        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += i;
        }

        System.out.print(A + " + ");
        for (int i = A + 1; i < B; i++) {
            System.out.print(i + " + ");
        }
        System.out.print(B + " = " + sum);
        
        
        
    }
    
}
