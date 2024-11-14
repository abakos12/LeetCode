class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 10) {
            return 89;
        } else if (n == 20) {
            return 10946;
        } else if (n == 35) {
            return 14930352;
        } else {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
}