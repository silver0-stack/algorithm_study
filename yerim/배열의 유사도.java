class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int i = 0; i < s1.length; i++){
            for(int j = 0; j < s2.length; j++){
                if(s1[i].equals(s2[j])){
                    answer = answer + 1;
                }
            }
        }
        return  answer;
    }
}

// 오답노트
// 문자열은 == 비교 불가!
// 문자열(String)은 주소를 반환하기에 ==으로 비교 불가능함
// equals() 이용하기!

// 나아질 점
// for문 사용하지 않고 다시 해보기
