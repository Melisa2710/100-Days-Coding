package Day25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        System.out.println("|===================================|");
        System.out.println("|        program kasir sederhana    |");
        System.out.println("|===================================|");
        System.out.println("|        pilih menu makanan         |");
        System.out.println("|===================================|");
        System.out.println("| 1.Nasi Goreng       Rp 10.000     |");
        System.out.println("| 2.Ayam Bakar        Rp 10.000     |");
        System.out.println("| 3.Ikan Bakar        Rp 12.000     |");
        System.out.println("| 4.Cumi Goreng       Rp 10.000     |");
        System.out.println("| 5.Ayam Geprek       Rp 10.000     |");
        System.out.println("|===================================|");
        
        System.out.println("pilih makanan 1/2/3/4/5 : ");
        int makanan = input.nextInt();
        
        System.out.println("Berapa Porsi : ");
        int jumlah_porsi = input.nextInt();
        
    }
    
}
