class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length;j++){
                if(array[i] >array[j]){
                answer =array[i];
                    array[i] = array[j];
                    array[j]=answer;
                }
            }
        }
        answer = array[array.length/2];
        return answer;
    }
}
