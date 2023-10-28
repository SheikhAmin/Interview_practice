public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String s = "java program selenium automation";
        s=s.replaceAll(" ","");
        System.out.println("after removing the white spaces: " + s);
    }
}
