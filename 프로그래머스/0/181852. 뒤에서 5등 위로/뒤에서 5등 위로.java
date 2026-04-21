class Solution {
    public int[] solution(int[] num_list) {
        int temp = 0;
        for(int i = 0; i<num_list.length-1; i++){
            for(int j = 1; j<num_list.length-i; j++){
                if(num_list[j]<num_list[j-1]) {
                    temp = num_list[j-1];
                    num_list[j-1] = num_list[j];
                    num_list[j] = temp;
                }
            }
        }
        int[] answer = new int[num_list.length-5];
        int cnt = 0;
        for(int i = 0; i<num_list.length; i++){
            if(num_list.length-answer.length-1<i){
                answer[cnt] = num_list[i];
                cnt++;
            }
        }
        // System.out.println(answer.length-5);
        return answer;
    }
}