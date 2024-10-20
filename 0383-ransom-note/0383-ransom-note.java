class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i < ransomNote.length(); i++) {
            String cha = Character.toString(ransomNote.charAt(i));
            boolean temp = magazine.contains(cha);
            if (!temp) {
                return false;
            } else {
                magazine = magazine.replaceFirst(cha, "");
            }
        }
        return true;
    }
}