class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int index = 0;
        
        if(names.length % 5 == 0) {
            answer = new String[names.length/5];
        }
        else{
            answer = new String[names.length/5+1];
        }
        
        for(int i=0; i<names.length; i+=5){
            answer[index] = names[i];
            index++;
        }
        return answer;
    }
}