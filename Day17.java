package Day17;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("username : ");
        String username = input.nextLine();
        System.out.print("password : ");
        String password = input.nextLine();
        
        if(username.equalsIgnoreCase("melisa") && password.equalsIgnoreCase("27")){
            System.out.print("login berhasil");
            
        }else{
            System.out.println("login gagal");
        }
    
    }
    
}  
