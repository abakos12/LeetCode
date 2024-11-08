class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int total = 0;
        
        for(int i = 0; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            } else if (salary[i] > max) {
                max = salary[i];
            }
            total += salary[i];
        }

        // System.out.println(min + " " + max + " " + total);

        return (double)(total - min - max) / (double)(salary.length - 2);
        
    }
}