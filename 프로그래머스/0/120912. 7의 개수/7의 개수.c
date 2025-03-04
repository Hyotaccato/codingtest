#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len) {
    int answer = 0;
    int tmp;
    for(int i = 0; i < array_len; i++)
    {
        tmp = array[i];
        while(1)
        {
            if(tmp % 10 == 7)
                answer++;
            tmp /= 10;
            if(tmp == 0)
                break;
        }
    }
    return answer;
}