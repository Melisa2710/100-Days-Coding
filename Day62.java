package Day62;

public class Main {
    
    public static void main(String[] args) {
        String data = "Nama: Melisa,Lahir: Mamasa,Kuliah: Unsulbar";
        String[] Nama = data.split(",");

        System.out.println("index0 = " + Nama[0]);
        System.out.println("index1 = " + Nama[1]);
        System.out.println("index2 = " + Nama[2]);
    }
}
