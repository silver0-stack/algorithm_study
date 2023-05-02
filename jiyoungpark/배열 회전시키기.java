class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            for (int i = 0; i < numbers.length; i++) {
                if (i == numbers.length - 1) {
                    answer[0] = numbers[i];
                } else {
                    answer[i + 1] = numbers[i];
                }
            }
        } else if (direction.equals("left")) {
            for (int j = 1; j <= numbers.length; j++) { // j<7. 1~6
                if (j == numbers.length) {
                    answer[j - 1] = numbers[0]; // answer[7]
                } else {
                    answer[j - 1] = numbers[j];
                }
            }
        }

        return answer;
    }
}