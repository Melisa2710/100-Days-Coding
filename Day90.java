package Day90;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka,jmlh, maks = 0, min = 100;
        
        System.out.print("Masukkan jumlah : ");
        jmlh = input.nextInt();
        
        for(int i = 1; i <= jmlh; i++){
            System.out.print("angka ke- "+i+" = ");
            angka = input.nextInt();
            
            if(angka > maks){
                maks = angka;
            }
            if(angka < min){
                min = angka;
            }
        }
        System.out.print("nilai terbesar = "+maks+"\nnilai terkecil = "+min);
    }
    
}
