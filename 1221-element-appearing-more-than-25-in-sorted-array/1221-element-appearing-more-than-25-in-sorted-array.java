class Solution {
    public int findSpecialInteger(int[] arr) {
        double target = ((double)arr.length / (double)4);
        int count = 0;
        int current = -1;

        for(int i = 0; i < arr.length; i++) {
            if (current != arr[i]) {
                current = arr[i];
                count = 1;
            } else {
                count++;
            }

            if (count > target) {
                return current;
            }

        }

    return -1;

    }
}