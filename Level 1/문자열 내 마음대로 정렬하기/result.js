function solution(strings, n) {
    let answer = strings;
    let answerLen = answer.length;
    if (answerLen > 0 && answerLen <= 50) {
        answer.sort();
        answer.sort(function (a, b) {
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

// sort 함수
// 반환 값 < 0 : a 가 b보다 앞에 있어야 한다.
// 반환 값 = 0 : a와 b의 순서를 바꾸지 않는다.
// 반환 값 > 0 : b가 a보다 앞에 있어야 한다.
