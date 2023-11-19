package Day42;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nilai A: ");
            int a = input.nextInt();

            System.out.print("Masukkan nilai B: ");
            int b = input.nextInt();

            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            } else {
                for (int m = a; m < b; m++) {
                    System.out.println(m);
                }
            }

            for (int s = b; s < a; s++) {
                System.out.println(s);
            }
        }
    



   }
    
}
