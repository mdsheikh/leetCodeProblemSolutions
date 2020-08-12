/**
 * one_bit_two_bitCharacter
 */
public class one_bit_two_bit_character {
    public static boolean isOneBitCharacter(int[] bits) {

        int count = 0;
        // bits.length -2 to avoid last 0, it is always 0
        for (int i = bits.length - 2; i >= 0 && bits[i] == 1; i++) {
            count++;
        }
        if (count % 2 > 0)
            return false;
        return true;

    }

    public static void main(String[] args) {
        int[] input = { 1, 1, 1, 0 };
        boolean result = isOneBitCharacter(input);
        System.out.println(result); // return false

    }

}