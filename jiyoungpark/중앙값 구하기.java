package jiyoungpark;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);

        int length = array.length;
        length = length / 2;

        answer = array[length];

        return answer;
    }
}
