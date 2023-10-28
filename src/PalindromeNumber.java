import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int org_num = num;
        int reverse = 0;
        while (num !=0){
            reverse = reverse*10+num%10;
            num=num/10;
        }
        if (reverse == org_num) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
