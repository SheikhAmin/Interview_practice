import java.util.Arrays;
import java.util.Collections;

public class SortUsingBuiltIn {
    public static void main(String[] args) {
        int a[] = {30,50,20,10,60};
        System.out.println("array before sorting: " + Arrays.toString(a));
        // sorting ascending order
        Arrays.sort(a);
        System.out.println("array after sorting(ascending): " + Arrays.toString(a));
        //sort descending order
        Integer [] array = new Integer[a.length];
        // Collections.reversenOrder() doesn't support premitive data type like int so I had to convert it to Integer
        for (int i=0;i<a.length;i++){
            array[i] = a[i];
        }
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("array after sorting(descending)" + Arrays.toString(array));
    }
}
