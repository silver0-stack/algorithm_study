import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        int len = numbers.length;

        for (int i = 0; i < k - 1; i++) {
            answer = answer + 2;
            if (answer > len) {
                answer = answer - len;
            }
        }
        return answer;
    }
}