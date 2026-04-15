class Solution {
    public int[] solution(int start_num, int end_num) {
        int cnt = 0;
        for(int i = start_num; i>=end_num; i--){
            cnt++;
        }
        int[] answer = new int[cnt];
        int temp = 0;
        for(int i = start_num; i>=end_num; i--){
            answer[temp] = i;
            temp++;
        }
        return answer;
    }
}