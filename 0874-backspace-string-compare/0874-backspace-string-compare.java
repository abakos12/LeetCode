class Solution {
    public boolean backspaceCompare(String s, String t) {
        String tempS = "";
        String tempT = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#') {
                if (tempS.length() > 0) {
                    tempS = tempS.substring(0, tempS.length() - 1);
                }
            } else {
                tempS = tempS + Character.toString(s.charAt(i));
            }
        }

        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == '#') {
                if(tempT.length() > 0) {
                    tempT = tempT.substring(0, tempT.length() - 1);
                }
            } else {
                tempT = tempT + Character.toString(t.charAt(i));
            }
        }

        // System.out.println(tempS);

        return tempS.equals(tempT);
    }
}