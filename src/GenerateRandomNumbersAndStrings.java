import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
public class GenerateRandomNumbersAndStrings {
    public static void main(String[] args) {
        // approach 1 --Random class
        /*
        Random r = new Random();
        int random = r.nextInt(100);
        System.out.println(random);
        double random1 = r.nextDouble();
        System.out.println(random1);
        */
        //approach2 -Math
        System.out.println(Math.random());
        //approach3 -apache commons-lang API
        String ranNum = RandomStringUtils.randomNumeric(5);
        System.out.println(ranNum);
        String ranStr = RandomStringUtils.randomAlphabetic(5);
        System.out.println(ranStr);
    }
}
