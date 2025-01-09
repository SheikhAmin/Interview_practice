import java.util.Arrays;

public class SecondLargestNum {
    public static int secondHighest(int[] a){
        int max1=0, max2=0, length=0, max2index = -1;
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
                max2index = i-1;
            }
            else if (a[i] > max2 && a[i] <max1) {
                max2 = a[i];
                max2index = i;
            }
        }
        /*
        for (int i=0;i<a.length;i++){
            if (a[i] == max2) length = i;
        }
        */
      return max2index;
        //you can send length as well in that case run the 2nd for loop
    }
    public static void main(String[] args) {
        int[] a = {1,10,2,3,4,5,6};
        //approach 1
        System.out.println(secondHighest(a));

    }
}
