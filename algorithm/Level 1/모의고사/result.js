function solution(answers) {
    let answer = [];
    let examCntArr = [0,0,0];  
    let studentList = [
        [1, 2, 3, 4, 5, 1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    ]
    for(let i=0; i<answers.length; i++){
        if(answers[i] === studentList[0][i% studentList[0].length])
            examCntArr[0]++;
        if(answers[i] === studentList[1][i% studentList[1].length])
            examCntArr[1]++;
        if(answers[i] === studentList[2][i% studentList[2].length])
            examCntArr[2]++;
    }
    let max = 0
    examCntArr.forEach(function(e){
        if(e > max) max = e
    });
    
    for(let i=0; i<examCntArr.length; i++){
        if(examCntArr[i] === max) answer.push(i+1)
    }
    
    return answer;
}