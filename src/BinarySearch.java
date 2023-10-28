import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // approach 1
        int a[] = {1,2,3,4,5,6,7,11,8,9,10}; // should be sorted
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        boolean flag = false;
        int key = 10;
        int l=0;
        int h=a.length-1;
        while (l<=h){
            int m = (l+h)/2;
            if (a[m]==key){
                System.out.println("element found");
                flag = true;
                break;
            }
            if (key > a[m]){
                l = m+1;
            }
            if (key < a[m]){
                h = m-1;
            }
        }
        if (flag == false) System.out.println("element not found");

        //approach 2 use built in method
        //here array should be sorted
        System.out.println(Arrays.binarySearch(a,100));
    }
}
