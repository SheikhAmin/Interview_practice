import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagrams {
    public static boolean areAnagrams(String s, String s1){
        String st1 = s.toLowerCase();
        String st2 = s1.toLowerCase();
        char [] chars = st1.toCharArray();
        Arrays.sort(chars);
        String s2 = new String(chars);
        char [] chars1 = st2.toCharArray();
        Arrays.sort(chars1);
        String s3 = new String(chars1);
        if (s2.equals(s3)) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen","Silent"));
    }
}
