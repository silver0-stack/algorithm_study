class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
        if(rsp.charAt(i)=='0'){
            answer+=5;
        }
        else if(rsp.charAt(i)=='2'){
            answer+=0;
        }
        else if(rsp.charAt(i)=='5'){
            answer+=2;
        }
            
        }
        return answer;
    }
}

// 문자열 추가 시 charAt() 으로 바꾸어야 할지, 그냥 더할지 고민
// charAt은 바꿀 수 있는 게 아니라 type error 남
