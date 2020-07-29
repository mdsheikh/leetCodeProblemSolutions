import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {

    public static List<String> generate_parenthesis(int n) {
        List<String> list = new ArrayList<String>();
        back_track(list, "", 0, 0, n);
        return list;

    }

    private static void back_track(List<String> list, String s, int open, int close, int maxNum) {
        if (s.length() == maxNum * 2) {
            list.add(s);
        }
        if (open < maxNum) {
            back_track(list, s + "(", open + 1, close, maxNum);
        }
        if (close < open) {
            back_track(list, s + ")", open, close + 1, maxNum);
        }

    }

    public static void main(String[] args) {

        int n = 3;
        System.out.println(generate_parenthesis(n));
    }

}