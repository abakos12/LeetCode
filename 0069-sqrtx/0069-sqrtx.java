class Solution {
    public int mySqrt(int x) {
        long current = 0;
        
        while(current * current <= x) {
            current++;
        }

        return (int)(current - 1);
    }
}