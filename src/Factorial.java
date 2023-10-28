import java.util.Scanner;

public class Factorial {
    public static void factorial(int num){
        int result = 1;
        for(int i=1; i<= num; i++){
            result = result * i;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        factorial(num);
    }
}
