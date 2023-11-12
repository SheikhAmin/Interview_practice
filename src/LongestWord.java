import java.util.Scanner;

public class LongestWord {
    public static String findLongestWord(String s){
        String [] st = s.split(" ");
        String longestWord = "";
        for (String word : st){
            if (word.length() > longestWord.length()) longestWord = word;
        }
        return longestWord;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String s=sc.nextLine();
        System.out.println(findLongestWord(s));
    }
}
