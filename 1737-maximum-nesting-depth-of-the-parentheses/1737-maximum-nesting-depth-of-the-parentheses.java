class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int runningTotal = 0;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                runningTotal++;
            } else if (s.charAt(i) == ')') {
                if (max < runningTotal) {
                    max = runningTotal;
                }
                runningTotal--;
            }

        }
        if (max < runningTotal) {
            max = runningTotal;
        }
        return max;
    }
}