package jiyoungpark;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        String[] str = new String[my_string.length()];
        str = my_string.split("");

        for (String s : str) {
            for (int i = 0; i < n; i++) {
                answer = answer + s;
            }
        }

        return answer;
    }
}