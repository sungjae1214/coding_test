class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i]>array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        answer = array[(array.length/2)+(int)0.9];
        return answer;
    }
}