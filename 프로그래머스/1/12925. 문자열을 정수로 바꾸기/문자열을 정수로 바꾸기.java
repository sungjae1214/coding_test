class Solution {
    public int solution(String s) {
        int answer = 0;
        int temp = 1;
        for(int i = 0; i<s.length(); i++){
            answer *=10;
            if(s.charAt(i)=='-') temp = -1;
            else if(s.charAt(i)=='1') answer += 1;
            else if(s.charAt(i)=='2') answer += 2;
            else if(s.charAt(i)=='3') answer += 3;
            else if(s.charAt(i)=='4') answer += 4;
            else if(s.charAt(i)=='5') answer += 5;
            else if(s.charAt(i)=='6') answer += 6;
            else if(s.charAt(i)=='7') answer += 7;
            else if(s.charAt(i)=='8') answer += 8;
            else if(s.charAt(i)=='9') answer += 9;
        }
        answer *=temp;
        return answer;
    }
}