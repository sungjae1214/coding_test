class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp = -10000*10000;
        for(int i = 0; i<numbers.length; i++){
            for(int j = 0; j<numbers.length; j++){
                if(i!=j){
                    if(temp < numbers[i]*numbers[j]) temp = numbers[i]*numbers[j];
                }
            }
        }
        answer = temp;
        return answer;
    }
}