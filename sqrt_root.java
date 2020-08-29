/**
 * sqrt_root
 */

public class sqrt_root {

    public static int mySqrt(int x) {
        if(x < 2) return x;
        int left = 0, right = x;
        while(left < right) {
            int mid = left + (right - left) / 2 + 1;
            if(Math.pow(mid, 2) > x) right = mid - 1;
            else left = mid;
        }
        return left;
    }
      
    

    public static void main(String[] args) {

        int n = 8;
        int  result = mySqrt(n);
        System.out.println(result);
        
    }
}