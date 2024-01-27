import java.util.Scanner;

public class countTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int result= 0;
        while (num!=0){
            num = num / 10;
            result++;
        }
        System.out.println(result);
    }
}
