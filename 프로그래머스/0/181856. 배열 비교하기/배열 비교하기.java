class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int answer_1 = 0;
        int answer_2 = 0;
        
        if(arr1.length != arr2.length){
            if(arr1.length > arr2.length){
                answer = 1;
            }else{
                answer = -1;
            }
        }
        if(arr1.length == arr2.length){
            for(int i=0; i<arr1.length; i++){
                answer_1 += arr1[i];
            }
            for(int i=0; i<arr2.length; i++){
                answer_2 += arr2[i];
            }
            if(answer_1 > answer_2){
                answer = 1;
            }else if(answer_1 < answer_2){
                answer = -1;
            }else{
                answer = 0;
            }
        }
        return answer;
    }
}