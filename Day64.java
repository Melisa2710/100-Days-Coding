package Day64;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();
        
        
        
        for(int i=1; i<=batas; i++){
            
            
            if(i %3 == 0){
                System.out.print(i);
            }
            
       
        }
         
        if(batas == 1 || batas == 2){
           System.out.print("kosong");
           
    
       }   
    }
    
}
