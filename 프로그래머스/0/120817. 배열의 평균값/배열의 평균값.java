class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int all = 0;
        for(int i = 0; i < numbers.length; i++){
            all += numbers[i];
            answer = (double)all/numbers.length;
        }
        return answer;
    }
}