package Day15;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double pulsa_biasa,pulsa_token,total,hasil;
        
        System.out.print("pulsa_bisa           :");
        pulsa_biasa = input.nextDouble();
        
        System.out.print("pulsa_token          :");
        pulsa_token = input.nextDouble();
        
        total = pulsa_biasa+pulsa_token;
        hasil = total/2;
        
        if(hasil <=100000){
            System.out.print("ya berhasil"+hasil);
            
        }else if(hasil >=5000){
            System.out.print("ya berhasil"+hasil);
        
        }else{
            System.out.print("tidak berhasil");
        }
        
        
        
        
    }
    
}
