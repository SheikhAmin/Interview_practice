package Practice;

import java.util.Scanner;

public class ReverseString {
    public static void reverseString(String s){
        String temp = "";
        for (int i=s.length()-1;i>=0;i--){
            temp = temp + s.charAt(i);
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        reverseString(s);
    }
}
