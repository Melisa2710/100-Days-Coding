package Day81;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = input.nextInt();
        int hasil = 0;
        
        for(int i = 1; i <= a; i++){
            System.out.print(i);
            hasil += a;
            
            if(i != a){
                System.out.print("+");
            }
        }
        System.out.print("=" + hasil);
    }
    
}
