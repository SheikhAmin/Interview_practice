package Practice;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt(); //1234
        int t = 0;
        while (num !=0){
            t = t*10+ num % 10;
            num = num /10;
        }
        System.out.println(t);
        int number = 1234;
        StringBuffer sb = new StringBuffer(String.valueOf(number));
        StringBuffer s = sb.reverse();
        System.out.println(s);


    }
}
