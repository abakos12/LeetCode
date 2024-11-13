class Solution {
    public String addBinary(String a, String b) {
        String sum = "";
        int carry = 0;

        while(a.length() > 0 && b.length() > 0) {
            int lastA = Character.getNumericValue(a.charAt(a.length() - 1));
            int lastB = Character.getNumericValue(b.charAt(b.length() - 1));

            switch(lastA + lastB + carry) {
                case 3:
                    sum = "1" + sum;
                    carry = 1;
                    break;
                case 2:
                    sum = "0" + sum;
                    carry = 1;
                    break;
                case 1:
                    sum = "1" + sum;
                    carry = 0;
                    break;
                case 0:
                    sum = "0" + sum;
                    carry = 0;
                    break;
            }

            a = a.substring(0, a.length() - 1);
            b = b.substring(0, b.length() - 1);
        }

        while(a.length() != 0) {
            int lastA = Character.getNumericValue(a.charAt(a.length() - 1));

            switch (lastA + carry) {
                case 2:
                    sum = "0" + sum;
                    carry = 1;
                    break;
                case 1:
                    sum = "1" + sum;
                    carry = 0;
                    break;
                case 0:
                    sum = "0" + sum;
                    carry = 0;
                    break;
            }

            a = a.substring(0, a.length() - 1);
        }

        while(b.length() != 0) {
            int lastB = Character.getNumericValue(b.charAt(b.length() - 1));

            switch (lastB + carry) {
                case 2:
                    sum = "0" + sum;
                    carry = 1;
                    break;
                case 1:
                    sum = "1" + sum;
                    carry = 0;
                    break;
                case 0:
                    sum = "0" + sum;
                    carry = 0;
                    break;
            }

            b = b.substring(0, b.length() - 1);
        }

        if (carry == 1) {
            sum = "1" + sum;
        }

        return sum;
    }
}