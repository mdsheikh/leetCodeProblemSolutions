
public class reverseSubstringParentheses {

    public static String reverseParentheses(String s) {
        int beginIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                beginIndex = i;
            }
            if (s.charAt(i) == ')') {
                endIndex = i;
                String tempString = s.substring(beginIndex + 1, endIndex);
                return reverseParentheses(
                        s.substring(0, beginIndex) + reverseString(tempString) + s.substring(endIndex + 1));

            }

        }
        return s;

    }

    private static String reverseString(String s) { // this helper function to reverse a sting
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(c[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "(ed(et(oc))el)";
        String reslult = reverseParentheses(s);
        System.out.println(reslult);
    }

}