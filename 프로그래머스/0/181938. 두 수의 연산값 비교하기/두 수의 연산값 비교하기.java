class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String temp1 = Integer.toString(a);
        temp1 +=b;
        int temp = Integer.parseInt(temp1);
        if(temp>2*a*b) answer = temp;
        else answer = 2*a*b;
        return answer;
    }
}