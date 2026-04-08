class Solution {
    public String solution(int age) {
        String answer = "";
        String temp = "";
        char ch = 'a';
        while(true){
            if(age>0){
                temp += (char)(ch+age%10);
                // temp = (char)(ch+age%10) + temp;
                age = age/10;
            }else break;
        }
        
        for(int i = temp.length()-1; i>=0; i--){
            answer += temp.charAt(i);
        }
        return answer;
    }
}