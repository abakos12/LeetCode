class Solution {
    public int maxProfit(int[] prices) {
        int[] profit = new int[prices.length];
        int pos = 0;
        int low = prices[0];
        int high = prices[0];

        for(int i = 0; i < prices.length; i++) {
            if (prices[i] > high) {
                high = prices[i];
            } else if (prices[i] < low) {
                profit[pos] = high - low;
                pos++;
                low = prices[i];
                high = prices[i];
            }
        }
        // System.out.println(high + " " + low);
        profit[pos] = high - low;

        int largest = 0;
        for(int i = 0; i < profit.length; i++) {
            if (profit[i] > largest) {
                largest = profit[i];
            }
        }

        return largest;
    }
}