class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        int cnt;
        for(int i = 0; i<(str1.length()-str2.length())+1; i++){
            cnt = 0;
            for(int j = 0; j<str2.length(); j++){
                if(str1.charAt(i+j)==str2.charAt(j)) cnt++;
            }
            if(cnt==str2.length()) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}