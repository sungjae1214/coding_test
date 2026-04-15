class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] temp = new char[2];
        for(int i = 0; i<my_string.length(); i++){
            if(i==num1){
                temp[0] = my_string.charAt(i);
            }
            else if(i==num2){
                temp[1] = my_string.charAt(i);
            }
        }
        
        for(int i = 0; i<my_string.length(); i++){
            if(i==num1){
                answer += temp[1];
            }
            else if(i==num2){
                answer += temp[0];
            }
            else answer += my_string.charAt(i);
        }
        return answer;
    }
}