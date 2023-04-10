class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)){
            answer = 1;
        }
        else{
            answer = 2;
        }
        return answer;
    }
}

// 문자열 비교 관련한 함수 contains()!
// 문자열 관련 함수 공부!!
