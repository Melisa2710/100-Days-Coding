package Day47;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan pilihan (1-3): ");
        
        // Menerima input dari pengguna
        int pilihan = scanner.nextInt();

        // Menggunakan switch case untuk memproses pilihan
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih opsi 1");
                break;
            case 2:
                System.out.println("Anda memilih opsi 2");
                break;
            case 3:
                System.out.println("Anda memilih opsi 3");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        // Menutup objek Scanner
        scanner.close();
    


    }
    
}
