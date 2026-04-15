class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] banana = new String[my_string.length()];
        for(int i = 0; i<my_string.length(); i++){
            banana[i] = "";
            for(int j = 0+i; j<my_string.length(); j++){
                banana[i] += my_string.charAt(j);
            }
            if(banana[i].equals(is_suffix)) {
                answer = 1;
                break;
            }
        }
        
        // for(int i = 0; i<banana.length; i++){
        //     if(banana[i].equals(is_suffix)){
        //         answer = 1;
        //         break;
        //     }
        // }
        return answer;
    }
}