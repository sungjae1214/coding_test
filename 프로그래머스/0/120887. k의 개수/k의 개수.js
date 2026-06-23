function solution(i, j, k) {
    var answer = 0;
    for(let temp = i; temp<=j; temp++){
        for(let n = 0; n<temp.toString().length; n++){
            if(temp.toString().charAt(n)==k){
                answer++;
            }
        }
        
    }
    return answer;
}