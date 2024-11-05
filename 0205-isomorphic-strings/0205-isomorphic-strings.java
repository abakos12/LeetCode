class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> list = new HashMap<Character, Character>();
        HashMap<Character, Character> list2 = new HashMap<Character, Character>();

        char sChar = 'a';
        char tChar = 'a';

        for(int i = 0; i < s.length(); i++) {
            sChar = s.charAt(i);
            tChar = t.charAt(i);

            // System.out.println(list.get(sChar));

            if (list.get(tChar) != null) {
                if(list.get(tChar) != sChar) {
                    return false;
                }
            }

            if (list2.get(sChar) != null) {
                if(list2.get(sChar) != tChar) {
                    return false;
                }
            }

            list.put(tChar, sChar);
            list2.put(sChar, tChar);
        }

        // System.out.println(list.values());


        

        return true;
    }
}