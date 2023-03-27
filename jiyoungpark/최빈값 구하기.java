import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int count = 0;
        int temp = 0;

        List<Integer> intList = new ArrayList<>();
        for (int ie : array) {
            intList.add(ie);
        }

        Set<Integer> set1 = new HashSet<Integer>(intList);

        for (int e : set1) {
            count = Collections.frequency(intList, e);
            // count = set에 있는 원소의 개수

            if (temp < count) {
                answer = e;
                temp = count;
            } else if (temp > 0 && temp == count) {
                answer = -1;
            }
        }

        return answer;
    }
}