class Solution {
    public int[] solution(String my_string) {
        int cnt = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i)<='9' && my_string.charAt(i)>='0') {
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i)<='9' && my_string.charAt(i)>='0') {
                answer[cnt] = my_string.charAt(i)-48;
                cnt++;
            }
        }
        for (int i = 0; i < answer.length-1; i++) {
            for (int j = 0; j < answer.length-1-i; j++) {
                if (answer[j] > answer[j + 1]) {
                    int temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }
        return answer;
    }
}