class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {        
        int mPos = 0;
        int nPos = 0;
        int numSlides = 0;

        // Checks to see which is larger
        for(int i = 0; i < m+n; i++) {
            if (nPos == n) {
                break;
            }

            if (nums2[nPos] < nums1[mPos]) {
                slide(nums1, mPos);
                numSlides++;
                nums1[mPos] = nums2[nPos];
                mPos++;
                nPos++;
            } else if (nums1[mPos] == 0 && checker(nums1, mPos)) {
                nums1[mPos] = nums2[nPos];
                mPos++;
                nPos++;
            } else {
                mPos++;
            }
        }
    }

    // Slides over by 1
    public void slide(int[] nums1, int pos) {
        for(int i = nums1.length - 1; i > pos; i--) {
            nums1[i] = nums1[i-1];
        }
    }

    public boolean checker(int[] nums1, int pos) {
        for(int i = pos; i < nums1.length; i++) {
            if (nums1[i] != 0) return false;
        }
        return true;
    }
}