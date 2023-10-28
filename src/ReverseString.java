import java.util.Scanner;

public class ReverseString {
    public static void reverse(String input){
        /*
        char [] a = new char[input.length()];
        for (int i=0; i<a.length;i++){
            a[i] = input.charAt(i);
        }
        for (int i = a.length; i > 0; i-- ){
            System.out.print(a[i-1]);
        }
        */

        String result = "";
        for(int i=input.length()-1; i>=0;i--){
            result = result+input.charAt(i);
        }
        System.out.println(result);
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        reverse(s);
    }
}

//  Write a function that takes a string as input and returns the string reversed. For example, if the input is "hello," the function should return "olleh."