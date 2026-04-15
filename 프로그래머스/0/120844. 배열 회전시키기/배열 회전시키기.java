class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int temp = 0;
        
        if(direction.charAt(0)=='l') answer[numbers.length-1] = numbers[0];
        else answer[0] = numbers[numbers.length-1];
        
        for(int i = 0; i<numbers.length-1; i++){
            if(direction.charAt(0)=='l'){
                answer[i] = numbers[i+1];
            }
            else answer[i+1] = numbers[i];
        }
        return answer;
    }
}