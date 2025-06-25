class Solution {
    public long[] solution(long n) {
        long temp = n;
        int cnt = 0;
        for(int i = 0; temp!=0; i++){
            temp = temp/10;
            cnt++;
        }
        System.out.print(cnt);
        long[] answer = new long[cnt];
        for(int i = 0; i<answer.length; i++){
            answer[i] = n%10;
            System.out.print(answer[i]);
            n = n/10;
        }
        
        return answer;
    }
}