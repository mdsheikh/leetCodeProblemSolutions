
public class bestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            max = Math.max(max, price - min);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] stocks = { 7, 1, 5, 3, 6, 4 };
        int result = maxProfit(stocks);
        System.out.println(result);
    }

}