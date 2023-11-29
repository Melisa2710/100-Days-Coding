package Day52;

public class Main {
    public static int Luas(int s){
        int L = s * s;
        return(s);
    }
    
    public static int keliling(int s){
        int k = 4 * s;
        return(k);
    }
    
    public static void tampil1(int s){
        System.out.print("L = s x s"+"\nL = "+s+" x "+s+"\nL = "+Luas(s));
    }
    public static void tampil2(int s){
        System.out.print("\n\nK = 4 x s"+"\nK = "+4+" x "+s+"\nK = "+keliling(s));
    }
    public static void main(String[] args) {
        int s;
        s = 6;
        tampil1(s);
        tampil2(s);
    }
    
}

//program luas dan keliling persegi dengan method
