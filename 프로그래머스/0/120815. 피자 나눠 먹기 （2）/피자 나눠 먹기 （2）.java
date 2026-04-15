class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        while(true){
            i++;
            if((n*i)%6==0){
                answer = (n*i)/6;
                break;
            }
        }
        return answer;
    }
}