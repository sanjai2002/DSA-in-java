
public class Leetcode121 {

    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        int ans = optimal(prices);
        System.out.println(ans);
        // System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    max = Math.max(prices[j] - prices[i], max);
                }
            }
        }

        return max;

    }

    public static int optimal(int[] prices) {
        int max = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            max = Math.max(max, prices[i] - minPrice);
        }
        return max;
    }

}
