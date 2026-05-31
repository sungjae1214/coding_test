function solution(arr)
{
    var answer = [];
    let cnt = 0;
    let temp = null;
    for(let x of arr){
        if(x!==temp){
            answer.push(x);
            temp = x;
        }
        else temp = x;
    }
    
    return answer;
}