class Solution {
    public char repeatedCharacter(String s) {
        String temp = "";
        for(int i = 0; i < s.length(); i++) {
            if(temp.contains(Character.toString(s.charAt(i)))) {
                return (s.charAt(i));
            } else {
                temp += s.charAt(i);
            }
        }
        return 'a';
    }
}