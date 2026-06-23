function solution(my_string) {
    var answer = '';
    let stack = [];
    for(let x of my_string){
        if(!stack.includes(x)){
            stack.push(x);
        }
    }
    return stack.join("");
}