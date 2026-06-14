class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    cnt++;
                    System.out.print(j+" ");
                }
            }
            System.out.println();
            if(cnt>=3){
                // System.out.println(i);
                answer++;
            }
            cnt = 0;
        }
        return answer;
    }
}