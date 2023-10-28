import java.util.Scanner;

public class CountSumOfDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int result = 0;

        while (num !=0){
            int rem = num % 10;
            result = result + rem;
            num = num /10;
        }
        System.out.println("Sum of digits: " + result);
    }
}
