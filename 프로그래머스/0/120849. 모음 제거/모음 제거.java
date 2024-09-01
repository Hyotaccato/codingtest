class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] vow = {"a", "e", "i", "o", "u"};
        
        for(String v : vow) {
            answer = answer.replaceAll(v, "");
        }
        return answer;
        
    }
}