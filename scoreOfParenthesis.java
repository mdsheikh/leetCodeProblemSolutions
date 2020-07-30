
/**
 * scoreOfParenthesis
 */
import java.util.Stack;

public class scoreOfParenthesis {
    public static int score_of_parenthesis(String S) {
        if (S.length() < 1)
            return -1;
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(result);
                result = 0;
            } else {
                result = Math.max(result * 2, 1);
                result += stack.pop();
            }
        }
        return result;

    }

    public static void main(String[] args) { // driver program
        String s = "()()()()"; // input string
        int result = score_of_parenthesis(s);
        System.out.println(result);

    }
}