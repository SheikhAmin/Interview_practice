public class CountCharacterOccurrence {
    public static void main(String[] args) {
        String s ="Java Programming Java oops";
        int total_count = s.length();
        int totalcount_afterRemove = s.replace("o","").length();
        int count = total_count - totalcount_afterRemove;
        System.out.println("Number of occurances of a is:"+count);
    }
}
