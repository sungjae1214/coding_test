class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 1;
        for(int i = 0; i<k; i++){
            answer = cnt;
            cnt+=2;
            if(cnt>numbers[numbers.length-1]+1) {
                cnt = 2;
            }
            if(cnt>numbers[numbers.length-1]) {
                cnt = 1;
            }
            
        }
        return answer;
    }
}