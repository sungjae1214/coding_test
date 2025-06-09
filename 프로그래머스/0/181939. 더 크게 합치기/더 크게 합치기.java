class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = 0;
        int d = 0;
        if(b<10) c = (a*10)+b;
        else if(b<100) c = (a*100)+b;
        else if(b<1000) c = (a*1000)+b;
        else if(b<10000) c = (a*10000)+b;
        if(a<10) d = (b*10)+a;
        else if(a<100) d = (b*100)+a;
        else if(a<1000) d = (b*1000)+a;
        else if(a<10000) d = (b*10000)+a;
        if(c>d) answer = c;
        else answer = d;
        return answer;
    }
}