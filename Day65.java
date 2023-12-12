package Day65;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.print("Masukkan nama : ");
            String nama = input.nextLine();
            
            if(nama.equalsIgnoreCase("Melisa")){
                System.out.print("Program berhenti !!!");
                break;
            }   
        }
    }
    
}
