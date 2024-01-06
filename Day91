package Day91;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int f1 = 0, f2 = 1, n, fn;
        System.out.print("Masukkan angka : ");
        n = input.nextInt();
        
        System.out.print("Deret Fibonacci \n"+f1+ " , " +f2);
        for(int i = 1; i < n; i++){
            fn = f2 + f1;
            System.out.print(", " + fn);
            f1 = f2;
            f2 = fn;
        }
        
    }
    
}
