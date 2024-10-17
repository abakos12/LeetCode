class Solution {
    public int maximumWealth(int[][] accounts) {
        int largest = 0;
        for(int i = 0; i < (accounts).length; i++) {
            // Iterates through customers
            int total = 0;
            for(int j = 0; j < (accounts[0]).length; j++) {
                //Iterates through accounts
                total += accounts[i][j];
            }
            if (total > largest) {
                largest = total;
            }
        }

        return largest;
    }
}