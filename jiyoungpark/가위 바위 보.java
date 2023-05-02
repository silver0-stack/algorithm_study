
import java.util.*;

class Solution {
    public String solution(String rsp) {
        String answer = "";

        // 가위 2, 바위 0, 보 5
        HashMap<String, String> hm = new HashMap<>();
        hm.put("2", "0");
        hm.put("0", "5");
        hm.put("5", "2");

        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);

            String s = hm.get(Character.toString(c));

            answer = answer + s;
        }

        return answer;
    }
}
