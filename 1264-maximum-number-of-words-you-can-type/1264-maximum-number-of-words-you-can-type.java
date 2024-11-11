class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int total = 0;

        String[] words = text.split(" ");

        for(String word : words) {
            int val = 1;
            for(int i = 0; i < word.length(); i++) {
                if(brokenLetters.contains(Character.toString(word.charAt(i)))) {
                    val = 0;
                }
            }
            total += val;
        }
        return total;
    }
}