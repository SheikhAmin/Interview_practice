import java.util.Scanner;

public class PalindromeNumber {
    public static void palindrome(int n){
        String val = Integer.toString(n);
        String rev = "";
        for (int i=val.length()-1;i>=0;i--){
            rev = rev+val.charAt(i);
        }
        if (val.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
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

        palindrome(num);
    }
}
