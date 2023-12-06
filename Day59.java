package Day59;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka batas: ");
        int batas = scanner.nextInt();

        if (batas > 2) {
            for (int i = 0; i <= batas; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("kosong");
        }
    


    }
    
}
