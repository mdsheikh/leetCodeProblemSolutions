
/**
 * validParenthesis
 */
import java.util.Stack;

public class validParenthesis {
    public static boolean valid_parenthesis(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '{') {
                stack.push(c);

            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String p1 = "(())"; // valid parenthesis
        String p2 = "{()}[]"; // valid parenthesis
        String p3 = "[(]"; // invalid parenthesis
        System.out.println(valid_parenthesis(p1)); // returns true
        System.out.println(valid_parenthesis(p2)); // returns true
        System.out.println(valid_parenthesis(p3)); /// returns false

    }
}