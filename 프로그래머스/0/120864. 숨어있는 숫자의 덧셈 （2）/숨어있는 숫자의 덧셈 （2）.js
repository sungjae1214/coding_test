function solution(my_string) {
    var answer = 0;
    let cnt = 0;
    let stack = [];
    for(let x of my_string){
        if(isNaN(x)===false){
            cnt++;
            if(cnt>1){
                stack[stack.length-1] += x;
            }
            else{
                stack.push(x);
            }
            
        }
        else{
            cnt = 0;
        }
    }
    for(let x of stack){
        answer += parseInt(x);
    }
    
    return answer;
}