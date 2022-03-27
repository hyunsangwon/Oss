
//풀이 1
function solution01(numbers) {
    let answer = 0;
    const MAX_SUM = 45;
    numbers.forEach((element) => {
        answer += element
    });
    return MAX_SUM - answer;
}
const arr = [1,2,3,4,6,7,8,0];
const arr2 = [5,8,4,0,6,7,9];
const arr3 = [1,3];
//풀이 2
function solution02(numbers) {
    let answer = 0;
    for(let i=0; i<10; i++){
        if(!numbers.includes(i)) answer += i; //includes 해당값이 포함하면 true 아니면 false
    } 
    return answer;
}
console.log(solution01(arr3));
console.log(solution02(arr3));