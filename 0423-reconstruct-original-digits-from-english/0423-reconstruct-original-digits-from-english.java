class Solution {
    public String originalDigits(String s) {
        String retString = "";

        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int countO = 0;
        int countT = 0;
        int countI = 0;
        int countS = 0;
        int countF = 0;

        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'z':
                    zero++;
                    break;
                case 'w':
                    two++;
                    break;
                case 'u':
                    four++;
                    break;
                case 'x':
                    six++;
                    break;
                case 'g':
                    eight++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 't':
                    countT++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 's':
                    countS++;
                    break;
                case 'f':
                    countF++;
                    break;
            }
        }

        one = countO - zero - two - four;
        three = countT - two - eight;
        five = countF - four;
        seven = countS - six;
        nine = countI - five - six - eight;

        retString += "0".repeat(zero) + "1".repeat(one) + "2".repeat(two) + "3".repeat(three) + "4".repeat(four) + "5".repeat(five) + "6".repeat(six) + "7".repeat(seven) + "8".repeat(eight) + "9".repeat(nine);
        
        return retString;
    }
}