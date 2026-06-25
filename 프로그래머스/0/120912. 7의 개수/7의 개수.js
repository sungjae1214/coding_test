function solution(array) {
    var answer = 0;
    let temp = array.join("");
    for(let x of temp){
        if(x==7){
            answer++;
        }
    }
    return answer;
}