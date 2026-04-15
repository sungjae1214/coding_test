class Solution {
    public int solution(int n) {
        int answer = 1;
        int temp = n;
        int cnt = 0;
        for(int i = 1; i<n; i++){
            if(temp%i==0) answer++;
        }
        return answer;
    }
}