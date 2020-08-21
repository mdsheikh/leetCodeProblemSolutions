import java.util.*;

public class backspaceComparison {

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack_one = new Stack<Character>();
        Stack<Character> stack_two = new Stack<Character>();

        for (char i : S.toCharArray()) {
            if (i != '#') {
                stack_one.push(i);
            } else if (!stack_one.isEmpty()) {
                stack_one.pop();
            }

        }

        for (char j : T.toCharArray()) {
            if (j != '#') {
                stack_two.push(j);
            } else if (!stack_two.isEmpty()) {
                stack_two.pop();
            }
        }
        String s1 = String.valueOf(stack_one);
        String s2 = String.valueOf(stack_two);
        return s1.equals(s2);

    }

    public static void main(String[] args) {
        String S = "a#c";
        String T = "b";
        boolean result = backspaceCompare(S, T);
        System.out.println(result);

    }

}