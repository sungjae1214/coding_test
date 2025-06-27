class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int row = 0;
        for(int i = 1; i<=numbers.length; i++){
            for(int j = 0; j<numbers.length-i; j++){
                row = numbers[j]*numbers[j+i];
                if(row > answer) answer = row;
            }
        }
        
        return answer;
    }
}