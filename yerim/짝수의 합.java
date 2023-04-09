class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++ ){
            if(i%2 == 0){
                answer = answer+i;
            }
        }
        return answer;
    }
}

// 다시 해볼 부분!!

// for문을 사용하지 않고 구하신 경우가 있다!
// 보고 추가 공부하기

