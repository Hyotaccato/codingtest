class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int a1= Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int a2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
                                        
        if(a1 > a2){
            answer = a1;
        }else{
            answer = a2;
        }
        return answer;
    }
}