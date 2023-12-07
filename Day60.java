package Day60;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sisi 1 :");
        int Sisi1 = input.nextInt();

        System.out.print("Sisi 2 :");
        int Sisi2 = input.nextInt();

        int keliling = Sisi1 * 4 ;
        System.out.println("Keliling :"+ keliling );

        int luas = Sisi1 * Sisi2;
        System.out.println("Luas :"+luas);
    }
    
}
