public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Prime number > 1
        // Which has only 2 factors 1 and itself
        int num = 1;
        int count = 0;
        if (num > 1){
            for (int i=1; i<=num; i++){
                if (num % i == 0) count++;
            }
            if (count == 2) System.out.println("prime number");
            else System.out.println("not a prime number");
        }
        else System.out.println("not a prime number");
    }
}
