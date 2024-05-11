
import java.util.Scanner;

public class LargestNumber {
    public static void largest(int [] a){
        int largest =a[0];
        /*
        for (int i=0; i<a.length-1;i++){
            for (int j=0;j<a.length-1;j++){
                if(a[j] > a[j+1]) largest = a[j];
            }
        }
        */
         for (int i=1; i<a.length;i++){
             if (a[i] > largest) largest = a[i];
         }
        System.out.println("largest number is " + largest);
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0; i<n;i++){
            System.out.println("Enter number");
            int num =sc.nextInt();
            a[i] = num;
        }
       largest(a);
    }
}
