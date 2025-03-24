class Solution {
    public int[] solution(int[] num_list) {
        int num_even = 0;
        int num_odd = 0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                num_even ++;
            }
            else{
                num_odd ++;
            }
        }
        int[] answer = {num_even, num_odd};
        return answer;
    }
}