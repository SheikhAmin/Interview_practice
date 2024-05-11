import java.util.Scanner;

public class LeetCode {
        public static void twoSum(int[] nums, int target) {
            int count = 0;
            int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] + nums[i+1] == target) {
                count = i;
                count1 = i+1;
            }
        }
        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] a={2,7,11,15};
        twoSum(a,9);

    }
}
