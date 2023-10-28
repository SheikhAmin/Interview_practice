import java.util.Scanner;

public class CountEvenOddInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //15
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int evencount = 0, oddcount = 0;
        while (num > 0){
            int rem = num % 10;
            if (rem % 2 ==0 ) evencount++;
            else oddcount ++;
            num = num /10;
        }
        System.out.println("even number count is: " + evencount);
        System.out.println("odd number count is: " + oddcount);
    }

}
