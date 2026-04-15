class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] temp = new char[my_string.length()];
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i)<'a') temp[i] += (char)(my_string.charAt(i)+('a'-'A'));
            else temp[i] = my_string.charAt(i);
            // System.out.print(temp[i]);
        }
        
        char temp1 = ' ';
        for(int i = 1; i<my_string.length(); i++){
            for(int j = 0; j<my_string.length()-i; j++){
                if (temp[j] > temp[j + 1]) {
                    temp1 = temp[j + 1];
                    temp[j + 1] = temp[j];
                    temp[j] = temp1;
                }
            }
        }
        for(int i = 0; i<my_string.length(); i++){
            answer += temp[i];
        }
        return answer;
    }
}