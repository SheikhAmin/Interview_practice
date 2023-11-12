import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagrams {
    public static boolean areAnagrams(String s, String s1){
     char [] chars = s.toCharArray();
     Arrays.sort(chars);
     String s2 = new String(chars);
     char [] chars1 = s1.toCharArray();
     Arrays.sort(chars1);
     String s3 = new String(chars1);
     if (s2.equals(s3)) return true;
     else return false;
    }
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen","silent"));
    }
}
