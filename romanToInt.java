import java.util.*;
public class romanToInt{
    public static int roman_to_int(String s) {
        HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
        hp.put('I', 1);
        hp.put('V', 5);
        hp.put('X', 10);
        hp.put('L', 50);
        hp.put('C', 100);
        hp.put('D', 500);
        hp.put('M', 1000);
        
        char[] sc = s.toCharArray();
        
        int total = hp.get(sc[0]);
        int prev = hp.get(sc[0]);
        for(int i = 1; i < sc.length; i++) {
        int cur = hp.get(sc[i]);
        if(cur <= prev) {
            total += cur;
        } else {
            total = total + cur - 2 * prev;
        }
            prev = cur;
      }
      return total;
    }   

    public static void main(String[] args) {
        String input =  "MCMXCIV";
        int result = roman_to_int(input);
        System.out.println("It is: " + result);
        
    }
}