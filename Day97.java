package Day97;

public class Main {
    
    public static void main(String[] args) {
        String [][] alamat = {
            {"Nama\t : ","MELISA"},
            {"Alamat\t : ","Mamasa"},
            {"Fakultas : ","Teknik"}
        };
        for(int i = 0; i < alamat.length; i++){
            for(int m = 0; m < alamat[i].length; m++){
                System.out.print(alamat[i][m]);
            }
            System.out.println();
        }
    }
    
}
