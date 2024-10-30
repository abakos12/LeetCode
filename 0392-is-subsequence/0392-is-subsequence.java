class Solution {
    public boolean isSubsequence(String s, String t) {
        
        for(int i = 0; i < t.length(); i++) {
            if (s.length() == 0) {
                return true;
            }

            if (t.charAt(i) == s.charAt(0)) {
                s = s.substring(1);
            }
        }
        if (s.length() == 0) {
            return true;
        }

        return false;
    }


}