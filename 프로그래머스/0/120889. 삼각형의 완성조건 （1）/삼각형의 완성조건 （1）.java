class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int temp = 0;
        int temp1 = 0;
        for(int i = 0; i<sides.length-1; i++){
            if(sides[i]<sides[i+1]) temp = sides[i+1];
        }
        for(int i = 1; i<sides.length; i++){
            for(int j = 0; j<sides.length-1; j++){
                if(sides[j]>sides[j+1]) {
                    temp1 = sides[j];
                    sides[j] = sides[j+1];
                    sides[j+1] = temp1;
                }
            }
        }
        
        if(sides[0]+sides[1]<=sides[2]) answer = 2;
        else answer = 1;
        return answer;
    }
}