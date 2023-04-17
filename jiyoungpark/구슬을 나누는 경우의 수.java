package jiyoungpark;

class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        int idx = 1;

        for (int i = share + 1; i <= balls; i++) {
            // share+1 ~ balls / 1 ~ share
            answer = answer * i; // 6,7
            answer = answer / idx;
            idx++;
        }
        return (int) answer;
    }
}