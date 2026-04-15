class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] a = new char[5];
        a[0] = 'a';
        a[1] = 'e';
        a[2] = 'i';
        a[3] = 'o';
        a[4] = 'u';
        String temp = "";
        int cnt = 0;
        for(int i = 0; i<my_string.length(); i++){
            cnt = 0;
            for(int j = 0; j<a.length; j++){
                 if(my_string.charAt(i)!=a[j]) {
                     cnt++;
                     if(cnt==5) answer+=my_string.charAt(i);
                 }
            }
        }
        return answer;
    }
}