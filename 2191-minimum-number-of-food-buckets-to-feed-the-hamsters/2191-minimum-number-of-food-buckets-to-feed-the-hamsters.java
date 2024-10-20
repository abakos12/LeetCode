class Solution {
    public int minimumBuckets(String hamsters) {
        int buckets = 0;

        if (hamsters.length() > 1) {
            if (hamsters.substring(0, 2).equals("HH") || hamsters.substring(hamsters.length() - 2).equals("HH")) {
                return -1;
            }
            
        } else {
            if (hamsters.substring(0, 1).equals("H")) {
                return -1;
            }
        }
        
        for(int i = 1; i < hamsters.length() - 1; i++) {
            if(hamsters.charAt(i-1) == 'H' && hamsters.charAt(i+1) == 'H' && hamsters.charAt(i) == '.') {
                buckets++;
                hamsters = hamsters.substring(0, i - 1) + "hBh" + hamsters.substring(i + 2);
            }
            
            if((hamsters.charAt(i-1) == 'H' || hamsters.charAt(i-1) == 'h') && (hamsters.charAt(i) == 'H' || hamsters.charAt(i) == 'h') && (hamsters.charAt(i+1) == 'H' || hamsters.charAt(i+1) == 'h')) {
                return -1;
            }
        }

        for(int i = 0; i < hamsters.length() - 1; i++) {
            if(hamsters.charAt(i) == '.' && hamsters.charAt(i+1) == 'H') {
                buckets++;
                i++;
            } else if(hamsters.charAt(i) == 'H' && hamsters.charAt(i+1) == '.') {
                buckets++;
            }
        }


        
        return buckets;
    }
}