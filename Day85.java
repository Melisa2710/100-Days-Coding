package Day85;

public class Main {
    
    public static void main(String[] args) {
        int[] angka = {01, 01, 2024};
        String[] kataArray = {"Tahun" , "Baru🎆"};
        
        System.out.print("Tanggal \t: ");
        for (int tanggal : angka) {
            System.out.print(tanggal + " ");
        }

        System.out.println(); 
        
        System.out.print("Selamat \t: ");
        for (String kata : kataArray) {
            System.out.print(kata + " ");
        }
    }
    
}
