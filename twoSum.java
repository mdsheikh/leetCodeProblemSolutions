
public class twoSum{

    public static int[] two_Sum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                int target_sum = nums[i] + nums[j];

                if(target_sum == target){
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;

                    return result;

                }
               
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 3;
        int result[] = two_Sum(arr, target);
        for(int i : result){
             System.out.print(i + " ");
         }
    }
   
}