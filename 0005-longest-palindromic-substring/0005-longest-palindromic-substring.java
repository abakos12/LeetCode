class Solution {
    public String longestPalindrome(String s) {
        int size = s.length();

        // brute force by checking all sizes from largest to smallest
        while(size >= 0) {
            for(int i = 0; i < s.length() - size; i++) {
                String temp = (s.substring(i, i+size+1));
                if (palindrome(temp)) {
                    return temp;
                }
            }
            size--;
        }
        return "";
    }

    public boolean palindrome(String s) {
        for(int i = 0; i < ((s.length() + 1) / 2); i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}