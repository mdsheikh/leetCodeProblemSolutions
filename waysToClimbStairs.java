import javax.lang.model.util.ElementScanner14;

public class waysToClimbStairs {

    public static int climbStairsRecursion(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        return climbStairsRecursion(n - 1) + climbStairsRecursion(n - 2);
    }

    public static int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int[] cs = new int[n];
        cs[0] = 1;
        cs[1] = 2;
        for (int i = 2; i < n; i++) {
            cs[i] = cs[i - 1] + cs[i - 2];
        }
        return cs[n - 1];

    }

    public static void main(String[] args) {

        int n = 3;
        // using dynamic programming
        int result = climbStairs(n);
        System.out.println(result);
        // using recursion
        int result2 = climbStairsRecursion(n);
        System.out.println(result2);
    }

}