class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1temp = 0;
        int arr2temp = 0;
        if(arr1.length<arr2.length) answer = -1;
        else if(arr1.length>arr2.length) answer = 1;
        else if(arr1.length==arr2.length){
            for(int i = 0; i<arr1.length; i++){
                arr1temp += arr1[i];
                arr2temp += arr2[i];
            }
            if(arr1temp>arr2temp){
                answer = 1;
            }
            else if(arr1temp<arr2temp){
                answer = -1;
            }
            else answer = 0;
        }
        return answer;
    }
}