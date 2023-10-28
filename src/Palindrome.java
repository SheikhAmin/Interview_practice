import java.util.Scanner;

public class Palindrome {
    public static boolean  palindromeCheck(String input){
    input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int left = 0;
    int right = input.length()-1;
    while (left < right){
        if (input.charAt(left) != input.charAt(right)) return false;
        left++;
        right--;
    }

    return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide Input");
        String input = sc.next();
        boolean a = false;
        try{
            int number = Integer.parseInt(input);
            String s = Integer.toString(number);
            a = palindromeCheck(s);
        }
        catch (NumberFormatException e){
            a= palindromeCheck(input);
        }
       if (a) System.out.println("palindrome");
       else System.out.println("not palindrome");
    }
}
