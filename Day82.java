package Day82;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        String tglLahir;
        System.out.print("Masukkan tanggal lahir anda : ");
        tglLahir = input.nextLine();
        
        String[] split = tglLahir.split(" ");
        String tgl = split [0];
        String bln = split [1];
        String thn = split [2];
        
        System.out.println("Tanggal\t : " + tgl + "\nBulan\t : " + bln + "\nTahun\t : " + thn);
        System.out.println("("+tglLahir+")");  
    }
    
}
