class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")){
            for(int i = 0; i < numbers.length; i++){
                
                if(i < numbers.length && i != (numbers.length-1)){
                    answer[i+1] = numbers[i];
                }
                else if(i == (numbers.length-1)){
                    answer[0] = numbers[i];
                }
            }
        }
        else if(direction.equals("left")){
            for(int i = numbers.length -1; i >= 0; i--){
                if(i < numbers.length && i != 0){
                    answer[i-1] = numbers[i];
                }
                else if(i == 0){
                    answer[numbers.length-1] = numbers[i];
                }
            }
        }
        return answer;
    }
}

// if의 조건을 제대로 설정해주지 않아서 인덱스 넘어가는 에러
// 더 좋은 알고리즘 고민해보기
