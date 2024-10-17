class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returnVal = new int[2];
        outerloop:
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if (j==i) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    returnVal[0] = i;
                    returnVal[1] = j;
                    break outerloop;
                }
            }
        }
        return returnVal;
    }
}