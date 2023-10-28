import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        // Using StringBuffer class
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        //using  algo
        int reverse = 0;
        while (num !=0){
            reverse = reverse*10+num%10;
            num=num/10;
        }
        System.out.println("reverse number is:"+ rev);
    }
}
