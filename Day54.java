package Day54;

public class Main {
    public static double Luas(double PI, double r){
        double L = PI * r * r;
        return L;
    }
    
    public static void main(String[] args) {
       final double PI = 3.14;
        double r = 7.1;
        
       System.out.print("L = PI x r x r "+ "\nL = "+Luas(PI,r));  
    }
    
}
