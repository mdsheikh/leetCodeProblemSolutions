public class reverseInt {
    public static int reverse_int(int x) {
        
        long result = 0;
        while(x != 0){
            int lastDigit = x % 10 ;
            long newResult = result * 10 + lastDigit;
            result = newResult;
            x = x/10;
            if(result > Integer.MAX_VALUE ||  result < Integer.MIN_VALUE)
            return 0;
         }
         return (int) result;
        
    }
    
    public static void main(String[] args) {
        // testing for both positive and negatve numbers
        int test1  = 1234509;
        int result1 = reverse_int(test1);
        System.out.println(result1);
     
        


    
        
    }
    
}