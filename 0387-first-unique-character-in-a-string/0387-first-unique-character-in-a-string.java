class Solution {
    public int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            boolean check = true;
            for(int j = 0; j < s.length(); j++) {
                if (j == i) {
                    continue;
                }
                if (current == s.charAt(j)) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                return i;
            }
        }

        return -1;
    }
}