function solution(a, b) {
    answer = Math.max(Number(`${a}${b}`), Number(`${b}${a}`))
    return answer;
}