import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of T");
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            System.out.println("Enter number");
            int num = sc.nextInt();
            if ( num < 1000){
                if(num % 2 == 0) System.out.println("even");
                else System.out.println("odd");
            }
        }
    }
}
