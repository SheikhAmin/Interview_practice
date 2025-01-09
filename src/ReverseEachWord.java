import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        // approach 1
        String [] word = s.split(" ");
        String reverse = "";
        for (String w:word){
            String reverseWord = "";
            for (int i=w.length()-1;i>=0;i--){
                reverseWord = reverseWord + w.charAt(i);
            }
            reverse = reverse+reverseWord+" ";
        }
        System.out.println(reverse);
        //approach 2
        String [] words = s.split(" ");
        StringBuilder reverseword = new StringBuilder();
        for (String w:words){
            StringBuilder sb= new StringBuilder(w);
            sb.reverse();
            reverseword.append(sb).append(" ");
        }
        System.out.println(reverseword);
    }
}
