class Solution {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;

        for(int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);

            switch(move) {
                case 'R': 
                    horizontal++;
                    break;
                case 'L':
                    horizontal--;
                    break;
                case 'U':
                    vertical++;
                    break;
                case 'D':
                    vertical--;
                    break;
            }
        }
        return (horizontal == 0 && vertical == 0);
    }
}