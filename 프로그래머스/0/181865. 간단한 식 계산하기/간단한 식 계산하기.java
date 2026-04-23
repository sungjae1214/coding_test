class Solution {
    public int solution(String binomial) {
        int answer = 0;
        char op = ' ';
        int a = 0;
        int b = 0;
        int cnt = 0;
        for(int i = 0; i<binomial.length(); i++){
            if(binomial.charAt(i)>='0' && cnt==0){
                a*=10;
                a += binomial.charAt(i)-'0';
            }
            else if(binomial.charAt(i)>='0' && cnt>1){
                b*=10;
                b += binomial.charAt(i)-'0';
            }
            else if(binomial.charAt(i)=='+' || binomial.charAt(i)=='-' || binomial.charAt(i)=='*'){
                op = binomial.charAt(i);
            }
            else{
                cnt++;
            }
        }
        switch(op){
            case '+' : answer = a+b; break;
            case '-' : answer = a-b; break;
            case '*' : answer = a*b; break;
        }
        return answer;
    }
}