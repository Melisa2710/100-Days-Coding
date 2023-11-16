package Day39;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        operator aritmatika (* / % + -)
        yang saya gunakan adalah (+)
        
        */
        
        int a, b, c;
        
        System.out.print("Masukkan nilai a : ");
        a = input.nextInt();
        
        System.out.print("Masukkan nilai b : ");
        b = input.nextInt();
        
        c = a + b;
        System.out.print(a + " + " + b + " = " + c);
    }
    
}
