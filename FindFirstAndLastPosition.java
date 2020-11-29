/**
 * FindFirstAndLastPosition
 */
public class FindFirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        
        int[] result = new int[2];
        result[0] = findFirstPosition(nums, target);
        result[1] = findLastPostion(nums, target);   
        return result;
    }
    
    private static  int findFirstPosition(int[] nums ,int target){
        
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target)  index = mid;

           if(nums[mid] >= target){
               end = mid -1;
            }
            else{
                start = mid +1; 
            }
           
        }
    
        
        return index;
        
    }
    
     private static int findLastPostion( int[] nums, int target){
            
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target)  index = mid;
                 
           if(nums[mid] <= target){
               
               start = mid + 1;
            }
            else{
                end = mid - 1;
            }

            
        }
        
         return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,4,10};
        int target = 4;
        System.out.print(searchRange(arr, target));
    }


}