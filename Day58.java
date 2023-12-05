package Day58;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int bilangan,pangkat,hasil;
        
        System.out.print("bilangan : ");
        bilangan = input.nextInt();
        
        System.out.print("pangkat\t : ");
        pangkat = input.nextInt();
        
        System.out.print("------------------------------------");
        System.out.print("HASIL  : ");
        hasil = bilangan;
        for(int i = 1; i < pangkat; i++){
            hasil *= bilangan;
        }
       System.out.print(hasil);
    }
    
}
