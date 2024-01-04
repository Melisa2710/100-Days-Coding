package Day89;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai : ");
        int jmlh = input.nextInt();
        double nilai, total = 0, ratarata;
        for(int i = 1; i <= jmlh; i++){
            System.out.print("nilai ke- " +i + " = ");
            nilai = input.nextDouble();
            total += nilai;
        }
        ratarata = total / jmlh;
        System.out.print("Total\t\t = "+total + "\nRata-rata\t = "+ratarata);
    }
    
}
