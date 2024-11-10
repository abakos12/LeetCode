class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> retVal = new ArrayList<String>();
        
        for(int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                retVal.add("FizzBuzz");
            } else if (i % 5 == 0) {
                retVal.add("Buzz");
            } else if (i % 3 == 0) {
                retVal.add("Fizz");
            } else {
                retVal.add(Integer.toString(i));
            }
        }

        return retVal;

    }
}