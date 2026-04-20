class Solution {
    public long solution(long n) {
        long answer = 0;
        long i = 0;
        while(true){
            if(n==i*i){
                answer = (i+1)*(i+1);
                break;
            }
            else if(i*i>50000000000000l){
                answer = -1;
                break;
            }
            i++;
        }
        return answer;
    }
}