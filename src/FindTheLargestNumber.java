import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();
        //approach 1
        if ((a > b) && (a>c)) System.out.println(a + " is the largest number");
        if ((b > a) && (b>c)) System.out.println(b + " is the largest number");
        if ((c > a) && (c>b)) System.out.println(c + " is the largest number");
        // approach 2 ternary operator
        int largest1 = a>b?a:b;
        int largest2 = c>largest1?c:largest1;
        System.out.println(largest2 + " is the largest number");
        // approach3 Math.max(a,b)
        int max = Math.max(a,b);
        int max1 = Math.max(c,max);
        System.out.println(max1 + " is the largest number");
    }
}
