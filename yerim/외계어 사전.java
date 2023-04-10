class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        String[] spell2 = new String[spell.length];
        for(int i = 0; i< spell.length; i++){
            spell2[i] = spell[i];

        }

        for(int i = 0; i < dic.length; i++){
            for(int j = 0; j < dic[i].length(); j++){
                for(int k = 0; k < spell.length; k++){
                    if(dic[i].charAt(j) == spell[k].charAt(0)){
                        answer++;
                        spell[k] ="_";
                    }
                }
            }
            for(int l = 0; l< spell.length; l++){
            spell[l] = spell2[l];

        }
             if(answer == spell.length){
                    answer = 1;
                    break;
            }
            else{
                answer = 0;
            }
        }
        if(answer != 1){
            answer = 2;
        }
        return answer;
    }
}

// 다른 방법 보고 공부하기
// 문제에서 중복되지 않게 라고 했는데 제대로 확인하지 못함
// 문제 제대로 읽기!!
// for문 인덱스 관련 확인!!
