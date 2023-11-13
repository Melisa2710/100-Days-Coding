package Day36;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama,alamat,ttl,noHp,jenis;
        byte umur;
      
        System.out.println("---Masukan Bio Data Anda---");
        System.out.print("Nama\t\t : ");
        nama = input.nextLine();
        
        System.out.print("Jenis Kelamin\t : ");
        jenis = input.nextLine();
        
        System.out.print("Alamat\t\t : ");
        alamat = input.nextLine();
        
        System.out.print("TTL\t\t : ");
        ttl = input.nextLine();
        
        System.out.print("Umur\t\t : ");
        umur = input.nextByte();
        
        System.out.print("No Hp\t\t : ");
        noHp = input.next();
        
        
        System.out.println("==========================");
        System.out.println("--Data Mahasiswa--"+"\nNama\t\t : "+nama+"\nJenis Kelamin\t : "+jenis+"\nAlamat\t\t : "+alamat+"\nTTL\t\t : "+ttl+"\nUmur\t\t : "+umur+"\nNo Hp\t\t : "+noHp);
        
    }
    
}
    
    
