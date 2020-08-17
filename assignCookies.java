import java.util.Arrays;

/**
 * asssignCookies
 */
public class assignCookies {

    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0; i < s.length && count < g.length; i++) {
            if (s[i] >= g[count]) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] children = { 1, 2 };
        int[] cookies = { 1, 2, 3 };
        int result = findContentChildren(children, cookies);
        System.out.println(result);
    }

}