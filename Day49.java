package Day49;

public class Main {
    
 //prosedur   
 public static void mahasiswa(){
  String nama = "Melisa";
   int umur = 18;
     System.out.println("Nama\t : "+nama+" \n"+"Umur\t : "+umur+"th");
 }
   //fungsi
    public static String alamat(){
     String asal = "Mamasa";
       int kode_pos = 91362;
       return "Asal\t : "+asal+" \n"+"Kode pos : "+kode_pos;
   }
    
    
     public static void main(String[] args) {
        mahasiswa();
        System.out.println(alamat());
    }
    
}
