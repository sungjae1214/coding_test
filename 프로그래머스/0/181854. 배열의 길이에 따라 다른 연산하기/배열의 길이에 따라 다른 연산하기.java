class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        for(int i = 0; i<answer.length; i++){
            answer[i] = arr[i];
            if(arr.length%2==1 && i%2==0){
                answer[i] += n;
            }
            else if(arr.length%2==0 && i%2==1){
                answer[i] += n;
            }
        }
        return answer;
    }
}