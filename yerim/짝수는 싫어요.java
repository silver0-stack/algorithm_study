class Solution {
    public int[] solution(int n) {
        int num = 0;
        for(int i =1; i<= n; i++){
            if(i%2 == 1){
                num = num + 1;
            }
        }
        
        int[] answer = new int[num];

        for(int i =1; i<= n; i++){
            if(i%2 == 1){
                answer[i/2] = i;
            }
        }
        
        return answer;
    }
}

// 나아질 점
// for문 쓰지 않고 다시 해보기!
