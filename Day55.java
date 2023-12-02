package Day55;

public class Main {
    public static double keliling (double PI, double r){
        double d = 2 * r;
        double k = PI * d;
        return k;
    }
    public static void main(String[] args) {
     final double PI = 3.15;
         double r = 7;
         double d = 2 * r;
        
        System.out.print("k = PI x d " + "\nk = " + PI + " x " + d + "\nk = " + keliling(PI,r));
    }
    
}
