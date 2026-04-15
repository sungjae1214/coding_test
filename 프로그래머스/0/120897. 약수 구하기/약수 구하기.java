class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        int temp = n;
        for(int i = 1; i<=n; i++){
            if(temp%i==0) {
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0) {
                answer[cnt] = i;
                cnt++;
            }
        }
        System.out.print(cnt);
        
        return answer;
    }
}