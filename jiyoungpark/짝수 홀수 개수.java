package jiyoungpark;

class Solution {
    public int[] solution(int[] num_list) {

        int[] answer = new int[2];
        int cnt_odd = 0;
        int cnt_even = 0;

        for (int i : num_list) {

            if (i % 2 == 0) {
                cnt_even++;
            } else {
                cnt_odd++;
            }

        }

        answer[0] = cnt_even;
        answer[1] = cnt_odd;
        return answer;
    }
}
