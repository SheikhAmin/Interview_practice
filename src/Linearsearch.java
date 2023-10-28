public class Linearsearch {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int search_ele=50;
        boolean flag = false;
        for (int i=0;i<a.length;i++){
            if (a[i] == search_ele) {
                System.out.println("element found");
                flag = true;
                break;
            }
        }
        if (flag == false) System.out.println("element not found");
    }
}
