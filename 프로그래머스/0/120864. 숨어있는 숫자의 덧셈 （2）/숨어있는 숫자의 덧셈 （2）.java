class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String mystr_num = my_string.replaceAll("[a-zA-Z]"," ").trim();
        String[] mystr_arr = mystr_num.split(" ");
        
        for(int i=0; i<mystr_arr.length; i++){
            if( !mystr_arr[i].equals("") ){
                answer += Integer.parseInt(mystr_arr[i]);
             }
        }
        return answer;
    }
}