package Day75;
import java.util.Arrays;
public class Main {
    
    public static void main(String[] args) {
     
        int[] array = {4, 1, 5, 3, 6, 0, 2};

        Arrays.sort(array);
        int n = array.length;

        // Membalik urutan array
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        System.out.print("Array setelah diurutkan: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    
  
    }
    
}
