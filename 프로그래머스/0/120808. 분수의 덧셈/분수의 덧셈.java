class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        if(denom1!=denom2){
            answer[1] = denom1*denom2;
            answer[0] = numer1*denom2+numer2*denom1;
        }else{
            answer[1] = denom1;
            answer[0] = numer1+numer2;
        }
        for(int i = Math.min(answer[0],answer[1]);i>1;i--){
            if(answer[1]%i==0&&answer[0]%i==0){
                answer[0]=answer[0]/i;
                answer[1]=answer[1]/i;
            }
        }
        return answer;
    }
}