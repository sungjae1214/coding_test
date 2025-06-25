class Solution {
    public int[] solution(int n) {
        
        int cnt = 0;
        int cnt1 = 0;
        for(int i = 1; i<=n; i++){
            if(i%2==1) cnt1++;
        }
        int[] answer = new int[cnt1];
        for(int i = 1; i<=n; i++){
            if(i%2==1) {
                answer[cnt] = i;
                cnt++;
            }
        }
        
        return answer;
    }
}