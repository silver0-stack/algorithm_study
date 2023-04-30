class Solution {
    public int solution(int n) {
        int answer = 2;
        for(int i=1; i<=n; i++){
            if(i*i ==n){
                answer=1; 
                break;
            }
        }
        return answer;
    }
}

// 조건 쓸 때 제대로 생각하고 쓰기
