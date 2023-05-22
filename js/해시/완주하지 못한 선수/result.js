// participant : 참여자, completion : 완주자
function solution(participant, completion) {
    let answer = '';
    let map = new Map();
    participant.map((e, i) => {
        map.set('participant'+i, e);
    });
    map.forEach((value, key) =>{
        console.log(value)
        console.log(key)
    });
    //로직 구현 중...!
    return answer;//완주하지 못한 선수의 이름을 return 
}

const participantArr = ["leo", "kiki", "eden"];
const completionArr = ["eden", "kiki"];
solution(participantArr, completionArr)