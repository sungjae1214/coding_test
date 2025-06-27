class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 0; ; i++){
            if(n!=0) {
                answer += n%10;
                n = n/10;
            }
            else break;
            
        }
        return answer;
    }
}