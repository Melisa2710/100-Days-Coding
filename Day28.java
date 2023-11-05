package Day28;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
       double gaji_bersih;
        
        System.out.println("Masukkan penghasilan anda : ");
        double penghasilan  = in.nextDouble();
        
        if (penghasilan <3000000){
            System.out.println("Tidak dikenakan pajak");
            System.out.println("karena dikenakan pajak Maka total penghasilan anda adalah "+ (gaji_bersih = penghasilan));
            
        }else if(penghasilan >=5000000){
            System.out.println("Dikenakan pajak sebesar 10%");
            System.out.println("karena dikenakan pajak maka total penghasilan anda adalah "+ (gaji_bersih = penghasilan - (penghasilan*0.1)));
        
        }else if(penghasilan >3000000 && penghasilan <5000000){
            System.out.println("Dikenakan pajak sebesar 5%");
            System.out.println("karena dikenakan pajak maka total penghasilan anda adalah "+ (gaji_bersih = penghasilan - (penghasilan*0.05)));
        }

    }
    
                 }
