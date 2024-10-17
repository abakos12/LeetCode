class Solution {
    public int lengthOfLongestSubstring(String s) {
        int largest = 0;
        int repeat = 0;
        String sub = "";

        for(int i = 0; i < s.length(); i++) {
            String temp = Character.toString(s.charAt(i));
            if(sub.contains(temp)) {
                if (largest < repeat) {
                    largest = repeat;
                }

                int pos = sub.indexOf(temp);
                sub = sub.substring(pos+1) + temp;
                

                repeat = sub.length();

                // if (largest < repeat) {
                //     largest = repeat;
                // }
                // substring = temp;
                // repeat = 1;
            } else {
                repeat++;
                sub += temp;
            }
        }
        if (largest < repeat) {
            largest = repeat;
        }

        return largest;
    }
}