class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < ((my_string.length())*n); i = i+n){
            for(int j = 1; j <= n; j++){
                answer = answer+ my_string.charAt(i/n);
            }
        }
        return answer;
    }
}


// 오답노트

// 1) 문제 잘못 이해
// 입력 받은 값만큼 반복하는 건데, 문자열 자체를 복사해서 넣는 것으로 착각함

// 2) 문자열과 배열의 다른 점 체크!!
// 문자열은 length() 와 charAt() 사용
// 배열은 length와 인덱싱 사용

// 3) 중첩 for 문은 알고리즘 상으로 좋지 않음
// 추가로 생각한 부분 넣기!!
// 다른 사람 풀이로도 공부하기!!
