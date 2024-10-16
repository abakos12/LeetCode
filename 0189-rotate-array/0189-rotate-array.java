class Solution {
    public void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] numsDup = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            numsDup[i] = nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            int pos = i - k;
            if (pos < 0) {
                pos += nums.length;
            }
            nums[i] = numsDup[pos];
        }

        // if (k > 0) {
        //     int end = nums[nums.length - 1];
        //     for(int i = nums.length - 1; i > 0; i--) {
        //         nums[i] = nums[i - 1];
        //     }
        //     nums[0] = end;

        //     rotate(nums, k-1);
        // }
    }
}