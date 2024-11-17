class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> tracker = new ArrayList();

        for(int i = 0; i < nums.length; i++) {
            if(tracker.contains(nums[i])) {
                tracker.remove(Integer.valueOf(nums[i]));
            } else {
                tracker.add(nums[i]);
            }
        }

        return tracker.get(0);
    }
}