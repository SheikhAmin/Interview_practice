package Practice;

import java.util.Scanner;

public class Palindrome {
    public static void palindromeCheck(String st){
        String s = st.replaceAll("[^a-zA-Z0-9]]","").toLowerCase();
        String s1 = s;
        String temp = "";
        for (int i=s.length()-1;i>=0;i--){
            temp = temp + s.charAt(i);
        }
        if (temp.equals(s1)) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input");
        String s =sc.next();
        try {
            int num = Integer.parseInt(s);
            String st = Integer.toString(num);
            palindromeCheck(st);
        }
        catch(NumberFormatException e){
          palindromeCheck(s);
        }
    }
}
