package Day74;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int index = input.nextInt();
        int jml_index = (5);
        int[] a = new int[jml_index];
        
        
        for(int i = 0; i < jml_index; i++){
            System.out.println("index ke- : "+i);
        }
        for(int j = 0; j < jml_index; j++){
            System.out.print(a[j]);
        }
    }
    
}
