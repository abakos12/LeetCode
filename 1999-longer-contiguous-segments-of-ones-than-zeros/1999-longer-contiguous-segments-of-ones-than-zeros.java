class Solution {
    public boolean checkZeroOnes(String s) {
        int maxLenOnes = 0;
        int maxLenZeros = 0;
        int curLenOnes = 0;
        int curLenZeros = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
                curLenZeros++;
                if(curLenOnes > maxLenOnes) {
                    maxLenOnes = curLenOnes;
                }
                curLenOnes = 0;
            } else {
                curLenOnes++;
                if(curLenZeros > maxLenZeros) {
                    maxLenZeros = curLenZeros;
                }
                curLenZeros = 0;
            }
        }
        if (curLenOnes > maxLenOnes) {
            maxLenOnes = curLenOnes;
        }
        if (curLenZeros > maxLenZeros) {
            maxLenZeros = curLenZeros;
        }

        return (maxLenOnes > maxLenZeros);
    }
}