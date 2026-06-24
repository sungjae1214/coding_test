function solution(n) {
    var answer = 0;
    let temp = 1;
    let cnt = 0;
    while(true){
        temp *= ++cnt;
        answer++;
        if(temp==n){
            break;
        }
        else if(temp>n){
            answer--;
            break;
        }
    }
    
    return answer;
}