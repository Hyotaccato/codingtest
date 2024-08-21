class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int abc = 2*a*b;
        
        if(ab>abc){
            answer = ab;
        }else{
            answer =abc;
        }
        return answer;
    }
}