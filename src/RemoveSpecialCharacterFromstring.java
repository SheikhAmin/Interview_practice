public class RemoveSpecialCharacterFromstring {
    public static void main(String[] args) {
        String s= "@#!$lating";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
