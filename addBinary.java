
/**
 * addBinary
 */
public class addBinary {

    public static String add_binary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            sb.append(carry);
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String a = "011";
        String b = "100";
        String result = add_binary(a, b);
        System.out.println(result);
    }
}