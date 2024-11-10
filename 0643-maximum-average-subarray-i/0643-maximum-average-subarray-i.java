class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0;
        for(int i = 0; i < k; i++) {
            max += nums[i];
        }
        max = max / (double)k;
        int count = 0;
        
        for(int i = 0; i <= nums.length - k; i++) {
            count = 0;
            for(int j = i; j < k + i; j++) {
                count += nums[j];
            }
            if (max < (double)count / (double)k) {
                max = (double)count / (double)k;
            }
        }
        if (max < (double)count / (double)k) {
            max = (double)count / (double)k;
        }

        return max;
    }
}