//각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
function solution(strings, n) {
    let answer = strings;
    let answerLen = answer.length;
    if (answerLen > 0 && answerLen <= 50) {
        answer.sort();
        answer.sort((a, b) => {
            if (a.charAt(n) > b.charAt(n)) {
                return 1;
            }
            if (a.charAt(n) < b.charAt(n)) {
                return -1;
            }
            return 0;
        });
    }
    return answer;
}
/* 
sort() 매개변수에 compareFunction가 올 수 있다.
return 양수면 자리를 교체
return 음수면 교체하지 않는다.
*/
const arr = ["sun", "bed", "car"];
const n = 1;
console.log(solution(arr,n));

