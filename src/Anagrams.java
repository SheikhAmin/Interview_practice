import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagrams {
    public static boolean areAnagrams(String s, String s1){
        String s2=s.toLowerCase();
        String s3 =s1.toLowerCase();
        char [] chars = s2.toCharArray();

        Arrays.sort(chars);
        String s4 = new String(chars);
        char [] chars1 = s3.toCharArray();
        Arrays.sort(chars1);
        String s5 = new String(chars1);
        if (s4.equals(s5)) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen","silent"));
    }
}
