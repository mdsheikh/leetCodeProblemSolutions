import java.util.HashMap;

/**
 * SingleNumber
 */
public class SingleNumber {

    public static int singleNumber(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }
            else{
                map.put(nums[i],1);
            }

        }
        for(int i : map.keySet()){
            return i;
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
}