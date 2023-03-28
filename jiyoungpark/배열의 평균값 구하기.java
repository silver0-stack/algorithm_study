package jiyoungpark;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;

        for (int i : numbers) {
            answer = answer + i;
        }

        answer = answer / numbers.length;

        return answer;
    }
}
