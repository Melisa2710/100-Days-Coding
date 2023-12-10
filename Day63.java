package Day63;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama = "Melisa";
        System.out.print("Masukan nama pengguna : ");
        String pengguna = input.nextLine();
        
        if(pengguna.equalsIgnoreCase(nama)){
            System.out.println("Berhasil");
        }else{
            System.out.println("Gagal");
        }
    }
    
}
