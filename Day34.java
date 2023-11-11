package Day34;

public class Main {
    
    public static void main(String[] args) {
        
        int angka1 = 37, angka2 = 40;

        boolean perbandingan = angka1 > angka2, persamaan = angka2 == angka2;
        boolean hasil = perbandingan && persamaan || angka1 > angka2, hasil2 =  angka2 > angka1, hasil1;
        System.out.println(hasil+"\n"+hasil2);
    }
    
}
