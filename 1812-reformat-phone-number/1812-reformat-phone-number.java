class Solution {
    public String reformatNumber(String number) {
        number = number.replace(" ", "");
        number = number.replace("-", "");

        String formatted = "";

        while(number.length() > 0) {
            if (number.length() > 4) {
                formatted = formatted + number.substring(0, 3) + "-";
                number = number.substring(3);
            } else if (number.length() == 4) {
                formatted = formatted + number.substring(0, 2) + "-" + number.substring(2, 4);
                break;
            } else if(number.length() == 3) {
                formatted = formatted + number;
                break;
            } else if(number.length() == 2) {
                formatted = formatted + number;
                break;
            }
        }

        return formatted;
    }
}