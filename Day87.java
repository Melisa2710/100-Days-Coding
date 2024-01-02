package Day87;

public class Main {
    
    public static void main(String[] args) {
        int angka = 5;
        System.out.print(angka + "! =");
        for(int i = angka; i > 0; i--){
            System.out.print(i);
            if(i > 1){
                System.out.print(" x ");
            }
        }
    }
    
}
