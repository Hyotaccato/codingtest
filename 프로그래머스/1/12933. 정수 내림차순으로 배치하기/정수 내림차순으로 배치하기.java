import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;

        String[] array = String.valueOf(n).split("");
        Arrays.sort(array, Collections.reverseOrder());

        String newstr = new String();
        for(int i = 0; i<array.length; i++)
            newstr+=array[i];

        answer = Long.parseLong(newstr);
        return answer;
    }
}