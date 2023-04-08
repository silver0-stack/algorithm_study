package jiyoungpark;

import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";

        // 23 -> cd
        answer = Integer.toString(age);

        List<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"));

        String[] sArray = answer.split("");
        answer = "";

        for (String s : sArray) {
            answer = answer + list.get(Integer.parseInt(s));
        }
        return answer;
    }
}