public class SearchInsertPositon {
    public static int searchInsert(int[] nums, int target) {
         
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
            
            if( nums[mid] == target){
                return mid;
            }
            
        }
        return start;
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 3;
        System.out.println(searchInsert(arr, target));
    }
    
}
