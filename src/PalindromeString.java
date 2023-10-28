import java.util.Scanner;

public class PalindromeString {
    public static String reverseStr(String str){
        String result = "";
        for (int i=str.length()-1;i>=0;i--){
            result = result + str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        String reverse = reverseStr(str);
        if (str.equals(reverse)) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
