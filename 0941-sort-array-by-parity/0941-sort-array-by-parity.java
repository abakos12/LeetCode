class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr.add(0, nums[i]);
            } else {
                arr.add(nums[i]);
            }
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
        }
        return nums;
    }
}