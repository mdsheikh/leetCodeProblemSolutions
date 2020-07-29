
/**
 * longestValidParenthesis
 */
import java.util.Stack;

public class longestValidParenthesis {
    public static int longest_valid_parenthesis(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int maxi = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxi = Math.max(maxi, i - stack.peek());
                }
            }

        }
        return maxi;

    }

    public static void main(String[] args) {

        String s = "((()))";
        int result = longest_valid_parenthesis(s);
        System.out.println(result);
    }
}