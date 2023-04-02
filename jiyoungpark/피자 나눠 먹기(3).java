package jiyoungpark;

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int first_slice = slice;
        int i = 2;

        if (n <= slice) {
            answer = 1;
        } else {
            while (slice < n) { // slice가 더 커지거나 같아지면 멈추기
                slice = first_slice * i;
                answer = i;
                i++;
            }
        }
        return answer;
    }
}
