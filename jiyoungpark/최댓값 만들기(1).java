package jiyoungpark;

import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        // sort -> 마지막 2개 원소의 곱
        List<Integer> intList = new ArrayList<>();

        for (int i : numbers) {
            intList.add(i);
        }

        Collections.sort(intList);

        int len = intList.size();
        answer = intList.get(len - 1) * intList.get(len - 2);

        return answer;
    }
}
