package Day50;

import java.util.Scanner;

public class Main {
    public static String mahasiswa(String nama, int umur){
        return "Nama saya\t : "+nama+"\nDan umur saya\t : "+umur+" th";
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        int umur;
        
        System.out.print("masukkan nama\t : ");
        nama = input.nextLine();
        
        System.out.print("masukkan umur\t : ");
        umur = input.nextInt();
        
        System.out.print(mahasiswa(nama, umur));
    }
    
}
