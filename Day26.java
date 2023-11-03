package Day26;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai a :");
         int a = input.nextInt();
        
        System.out.println("Masukkan nilai b :");
         int b = input.nextInt();
         
         if (a < b){
         for (int i=a; i<=b; i++){
         System.out.println(i);
            }
         }else{
         for(int i=b; i<=a; i++){
         System.out.println(i);
            }
         }   
    }
}
        
    

 
