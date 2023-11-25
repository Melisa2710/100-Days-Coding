package Day48;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas iterasi: ");
        int batasIterasi = scanner.nextInt();

        for (int i = 1; i <= batasIterasi; i++) {
            System.out.print("Apakah Anda ingin melanjutkan iterasi " + i + "? (ya/tidak): ");
            String jawaban = scanner.next();

            if (jawaban.equalsIgnoreCase("tidak")) {
                // Menggunakan continue untuk melewati iterasi jika jawaban adalah "tidak"
                continue;
            }

            System.out.println("Iterasi ke-" + i + " dilanjutkan.");
        }

        scanner.close();
    


    }
    
}
