package jiyoungpark;

class Solution {
    public int[] solution(int n) {
        int answerLength = 0;

        if (n % 2 == 0) {
            answerLength = n / 2;
        } else {
            answerLength = n / 2 + 1;
        }

        int[] answer = new int[answerLength];
        int j = 0;

        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 1) {
                answer[j] = i;
                j++;
            }
        }

        return answer;
    }
}