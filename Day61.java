package Day61;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = scanner.nextInt();

        for (int i = 2; i <= a; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }


    }
    
}
