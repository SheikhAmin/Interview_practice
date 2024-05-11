import java.util.Arrays;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] a = {1000, 30,100, 40, 20, 60,1};
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }

        // Built in approach
        int max1 = Arrays.stream(a).max().orElseThrow();
        int min1 = Arrays.stream(a).min().orElseThrow();

        System.out.println("Max value is " + max);
        System.out.println("Min value is " + min);

        System.out.println(max1 + " " + min1);
    }
}
