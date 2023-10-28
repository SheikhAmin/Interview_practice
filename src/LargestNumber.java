
import java.util.Scanner;

public class LargestNumber {
    public static void largest(int [] a){
        int largest =0;
        for (int i=0; i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[j] > a[i]) largest = a[j];
            }
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
