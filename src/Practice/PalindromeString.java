package Practice;

import java.util.Scanner;

public class PalindromeString {
    public static void palindrome(String s){
        String st = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String temp = "";
        for (int i=st.length()-1;i>=0;i--){
            temp = temp + st.charAt(i);
        }
        if (st.equals(temp)) System.out.println("palindrom");
        else System.out.println("not palindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        palindrome(s);
    }
}
