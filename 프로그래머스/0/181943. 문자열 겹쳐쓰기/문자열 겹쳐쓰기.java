class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int i = overwrite_string.length();
        int j = my_string.length();
        
        answer = my_string.substring(0,s)+overwrite_string+my_string.substring(s+i,j);
        
        return answer;
    }
}