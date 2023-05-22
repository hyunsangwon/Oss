function solution(answers) {
    let result = [];
    let max = 0;
    let examCntArr = [0,0,0]; 
    let studentList = [
        [1, 2, 3, 4, 5, 1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    ];
    answers.map((e, i) => {
        if(e === studentList[0][i % studentList[0].length])
            examCntArr[0]++;
        if(e === studentList[1][i % studentList[1].length])
            examCntArr[1]++;
        if(e === studentList[2][i % studentList[2].length])
            examCntArr[2]++;
    });
    examCntArr.forEach((e) => {
        if(e > max) max = e
    });
    examCntArr.map((e,i) => {
        //1번 부터 시작하므로 i+1
        if(e === max) result.push(i+1)
    });
    return result;
}