class Solution {
    public int maxProfit(int[] prices) {
        int lastDay = prices[0];
        int profit = 0;
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] > lastDay) {
                profit += prices[i] - lastDay;
            }
            lastDay = prices[i];
        }
        return profit;
    }
}