package Day80;

public class Main {
    
    public static void main(String[] args) {
        String tglLahir = "27 Oktober 2005";
        String[] split = tglLahir.split(" ");
        String tgl = split [0];
        String bln = split [1];
        String thn = split [2];
        
        System.out.println("Tanggal\t : " + tgl + "\nBulan\t : " + bln + "\nTahun\t : " + thn);
        System.out.println("("+tglLahir+")");  
    }
    
}
