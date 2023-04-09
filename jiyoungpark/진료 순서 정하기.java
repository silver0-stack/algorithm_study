package jiyoungpark;

import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] emergencyCopy = Arrays.copyOf(emergency, emergency.length);

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        Arrays.sort(emergency);

        int j = emergency.length;
        for (int i : emergency) {
            hm.put(i, j);
            j--;
        }

        int y = 0;
        for (int z : emergencyCopy) {
            answer[y] = hm.get(z);
            y++;
        }

        return answer;
    }
}