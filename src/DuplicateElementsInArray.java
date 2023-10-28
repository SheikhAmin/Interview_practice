import java.util.HashSet;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        String arr [] = {"java","c","c++","java","python"};
       // approach 1
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]) System.out.println("duplicate element is: " + arr[i]);
            }
        }
        //approach 2
        HashSet <String> langs = new HashSet<>();
        for (String l:arr){
            if (langs.add(l) == false) System.out.println("Duplicate element is: " + l);
        }
    }
}
