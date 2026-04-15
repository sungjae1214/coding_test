class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int temp = num;
        int cnt = 0;
        int max = 1;
        while(temp>0){
            cnt++;
            max *=10;
            temp = temp/10;
        }
        max /=10;
        for(int i = 0; i<cnt; i++){
            if(num/max==k) break;
            else if(num/max!=k) answer++;
            num %=max;
            max/=10;
        }
        if(cnt==answer) answer = -1;
        else answer++;
        return answer;
    }
}