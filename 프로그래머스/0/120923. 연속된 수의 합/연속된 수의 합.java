class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num]; //배열 길이 설정
        int start = (total/num) - ((num - 1)/2);
        // 평균: 14 / 4 = 3
        // 시작값: 3 - (3 / 2) = 2
        // 결과: [2, 3, 4, 5]

        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }
        return answer;
    }
}