package Day41;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        
        for(int i = 1; i <angka; i++ ){
            if(i %2 == 0){
                System.out.println("Genap\t "+i+" ");
            }
            else if(i%2 ==1) {
                System.out.println("\nganjil\t "+i+" ");
            
            }
        }
    }
    
}
