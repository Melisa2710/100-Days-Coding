package Day77;

public class Main {
    
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int total = 0;
        double rata;
        int jml_indx = a.length;
        
        for(int i = 0; i < jml_indx; i++){
            total += a[i];
        }
        rata = total/jml_indx;
        System.out.print(rata);
    }
    
}
