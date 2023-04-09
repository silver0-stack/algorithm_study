import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[numbers.length];
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

        
        return answer;
    }
}

// 오답노트

// 1) 문자 배열은 항상 뒤에 null 값 정해줘야 함
// 따라서 num2+1 처럼 null 값 지정 필수!!

// 2) 배열 사용 시 선언은 필수고 방식은 new int[크기]로 할당해준다.
// 선언 없이도 크기를 늘릴 수 있는 게 무엇이었는지 추가로 알아보기

// 3) C++ 과 다르게 배열 선언 방식은 int[] 배열 이름 이다!
