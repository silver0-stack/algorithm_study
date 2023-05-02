import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";

        String[] strArray = letter.split(" ");

        HashMap<String, Character> hLetter = new HashMap<>();

        hLetter.put(".-", 'a');
        hLetter.put("-...", 'b');
        hLetter.put("-.-.", 'c');
        hLetter.put("-..", 'd');
        hLetter.put(".", 'e');
        hLetter.put("..-.", 'f');
        hLetter.put("--.", 'g');
        hLetter.put("....", 'h');
        hLetter.put("..", 'i');
        hLetter.put(".---", 'j');
        hLetter.put("-.-", 'k');
        hLetter.put(".-..", 'l');
        hLetter.put("--", 'm');
        hLetter.put("-.", 'n');
        hLetter.put("---", 'o');
        hLetter.put(".--.", 'p');
        hLetter.put("--.-", 'q');
        hLetter.put(".-.", 'r');
        hLetter.put("...", 's');
        hLetter.put("-", 't');
        hLetter.put("..-", 'u');
        hLetter.put("...-", 'v');
        hLetter.put(".--", 'w');
        hLetter.put("-..-", 'x');
        hLetter.put("-.--", 'y');
        hLetter.put("--..", 'z');

        for (String s : strArray) {
            answer += hLetter.get(s);
        }

        return answer;
    }
}
