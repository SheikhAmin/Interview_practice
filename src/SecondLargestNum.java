import java.util.Arrays;

public class SecondLargestNum {
    public static int secondHighest(int[] a){
        // approach 1 needs sorted array
        int max1=0, max2=0, length=0;
        if (a[0]>a[1]){
            max1 = a[0];
            max2 = a[1];
        }
        else {
            max1 = a[1];
            max2 = a[0];
        }
        for (int i=2;i<a.length;i++){
            if (a[i]>max1){
                max2 = max1;
                max1 = a[i];
            }
            else if (a[i] > max2 && a[i] <max1) {
                max2 = a[i];
            }
        }
        for (int i=0;i<a.length;i++){
            if (a[i] == max2) length = i;
        }
      return length;
    }
    public static void main(String[] args) {
        int[] a = {1,10,2,3,4,5,6};
        // approach 2 needs sorted array
        Arrays.sort(a);
        int max = Arrays.stream(a).max().getAsInt();
        for (int i=0;i<a.length;i++){
            if (a[i] == max) System.out.println(i-1);
        }
        System.out.println(secondHighest(a));

    }
}
