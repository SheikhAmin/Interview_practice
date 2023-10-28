package Practice;

import java.util.Scanner;

public class PalindromeNum {
    public static void palindromeCheck(int n){
        int num = n;
        int temp = 0;
        while (n!=0){
            temp = temp * 10 + n % 10;
            n = n /10;
        }
        if (num == temp) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number"); //16461
        int num = sc.nextInt();
        palindromeCheck(num);
    }
}
