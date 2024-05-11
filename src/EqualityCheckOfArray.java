import java.util.Arrays;

public class EqualityCheckOfArray {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};
        // approach 1
        if (Arrays.equals(a1,a2)) System.out.println("equal");
        else System.out.println("not equal");
        // approach 2
        if (a1.length == a2.length){
            int count = 0;
          for (int i=0;i<a1.length;i++){
              if (a1[i] == a2[i]) count++;
              else {
                  System.out.println("not equal");
                  break;
              }
          }
          if (count == a2.length) System.out.println("equal");
        }
        else System.out.println("not equal");
    }
}
