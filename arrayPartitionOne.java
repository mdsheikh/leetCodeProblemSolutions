import java.util.Arrays;

/**
 * arrayPartitionOne
 */
public class arrayPartitionOne {
    public static int arrayPartition(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            result += Math.min(nums[i], nums[i + 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 3, 2 };
        int result = arrayPartition(nums);
        System.out.println(result); // it returns 4
    }
    // min(1,2) is 1
    // min(3,4) is 3
    // so 1 + 3 is 4

}