class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=code; i<=cipher.length(); i += code){
           answer += cipher.charAt(i-1);
        }
        return answer;
    }
}

// 인덱스 계산 잘하기
