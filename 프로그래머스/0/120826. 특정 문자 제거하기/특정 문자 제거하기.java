class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String cnt = "A";
        for(int i = 0; i<my_string.length(); i++){
            cnt = my_string.charAt(i)+"";
            if(!(cnt.equals(letter))) answer += my_string.charAt(i);
        }
        
        return answer;
    }
}