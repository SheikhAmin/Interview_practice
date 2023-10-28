import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of T");
        int T = sc.nextInt();
        int sum = 0;
        for (int i=0; i< T; i++){
            System.out.println("Enter number");
            int num = sc.nextInt();
            if(num % 2 == 0) System.out.println("even");
            else System.out.println("odd");
        }
    }
}
