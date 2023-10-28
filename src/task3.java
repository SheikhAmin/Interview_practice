public class task3 {
    public static void main(String[] args) {
        int count =0;
        for (int i=1000; i >= 1; i--){
            if (count < 5){
                System.out.print(i +" ");
                count ++;
            }
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
    }
}
