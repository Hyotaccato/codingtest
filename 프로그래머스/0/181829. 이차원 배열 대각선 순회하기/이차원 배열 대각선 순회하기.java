class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i += 1) {
        for (int j = 0; j < board[0].length; j += 1) {
        if (i + j <= k) {
            answer += board[i][j];
                }
            }
        }
        return answer;
    }
}