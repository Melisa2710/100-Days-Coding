package Day78;

public class Main {
    
    public static void main(String[] args) {
        
        int[] angkaArray = {25, 12, 2023};
        String[] kataArray = {"Hari" , "NATAL❄🎆"};
        
        System.out.print("Tanggal \t: ");
        for (int tanggal : angkaArray) {
            System.out.print(tanggal + " ");
        }

        System.out.println(); 
        
        System.out.print("Selamat \t: ");
        for (String kata : kataArray) {
            System.out.print(kata + " ");
        }

    }
    
}
