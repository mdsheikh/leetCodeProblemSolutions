public class removeDuplicates {
    public static int remove_duplicates(int[] nums){
        if(nums.length == 1) return 1;
        int j = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j + 1;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,5};
        int result = remove_duplicates(arr);
        System.out.println(result);  // it returns 5

        
    }
}