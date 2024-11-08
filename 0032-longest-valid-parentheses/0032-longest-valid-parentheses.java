class Solution {
    public int longestValidParentheses(String s) {
        int checksum = 0;
        int[] arr = new int[s.length() + 1];
        arr[0] = checksum;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                checksum++;
            } else {
                checksum--;
            }

            arr[i+1] = checksum;
        }

        int largest = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = arr.length - 1; j > i; j--) {
                if (arr[i] == arr[j]) {
                    // Not sure if valid yet
                    if (valid(s.substring(i, j))) {
                        if (largest < (j - i)) {
                            largest = j - i;
                        }
                        break;
                    }
                }
            }
        }

        return largest;
    }

    public boolean valid(String s) {
        int checksum = 0;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                checksum++;
            } else  {
                checksum--;
            }
            if (checksum < 0) {
                return false;
            }
        }
        if (checksum == 0) {
            return true;
        } else {
            return false;
        }
    }
}