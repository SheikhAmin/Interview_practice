import java.util.Arrays;

public class FindMissingNumInArray {
    public static void main(String[] args) {
// array no need to be sorted
        // there can't be any duplicate value
        // values should be in range

        int[] a ={1,2,4,7,6,5,9,8};
        // given value: 1+2+4+5 = 12 which is sum1
        // as values should be in range so : 1+2+3+4+5=15 which is sum2
        // sum1-sum2 = 15-12 = 3, which is the missing value
        int sum1 = 0;
        for (int j : a) {
            sum1 = sum1 + j;
        }
        int sum2 = 0;
        int range = Arrays.stream(a).max().orElseThrow();
        int min=Arrays.stream(a).min().orElseThrow();
        for (int i=min;i<=range;i++){
            sum2 = sum2 + i;
        }

        System.out.println("missing value is " + (sum2 - sum1));

      
    }
}
