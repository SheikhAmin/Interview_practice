public class FindMissingNumInArray {
    public static void main(String[] args) {
        // array no need to be sorted
        // there can't be any duplicate value
        // values should be in range

        int a[]={1,2,4,5};
        // given value: 1+2+4+5 = 12 which is sum1
        // as values should be in range so : 1+2+3+4+5=15 which is sum2
        // sum1-sum2 = 15-12 = 3, which is the missing value
        int sum1 = 0;
        for (int i=0; i<a.length;i++){
          sum1 = sum1 + a[i];
        }
        int sum2 = 0;
        int range = a[a.length-1];
        for (int i=1;i<=range;i++){
            sum2 = sum2 + i;
        }

        System.out.println("missing value is " + (sum2 - sum1));

      
    }
}
