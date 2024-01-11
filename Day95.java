package Day95;

public class Main {
    
    public static void main(String[] args) {
        int[][]angka = {
           {1, 7, 4},
           {7, 9, 8},
           {6, 3, 2}
       };
    int total = 0;
    
    for (int i = 0; i < angka.length; i++){
        for (int j = 0; j < angka[i].length; j++){
            total+= angka[i][j];
        }
    }System.out.println(total);
    }
    
}
