class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int leng = num_list.length;
        for(int i=0; i<leng; i++){
            answer[i] = num_list[leng-i-1];
        }
        return answer;
    }
}