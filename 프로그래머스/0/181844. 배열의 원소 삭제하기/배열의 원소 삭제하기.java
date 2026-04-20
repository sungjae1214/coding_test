class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int cnt = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]) cnt++;
            }
        }
        // cnt = 0;
        int temp = 0;
        int[] answer = new int[arr.length-cnt];
        for(int i = 0; i<arr.length; i++){
            cnt = 0;
            for(int j = 0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]) cnt++;
            }
            if(cnt==0) {
                // System.out.println(i+"cnt 들어옴");
                answer[temp] = arr[i];
                temp++;
            }
        }
        System.out.print(cnt);
        return answer;
    }
}