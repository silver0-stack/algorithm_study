package jiyoungpark;

class Solution {
    public int solution(int n) {
        int answer = 0;

        int b = 6;
        int r;

        int gop = n * 6;

        if (n <= 3) {
            answer = 1;
        } else if (n % 6 == 0) {
            answer = n / 6;
        } else {
            // GCD(n,b) = GCD(b,r)
            while (b != 0) {
                r = n % b;
                n = b;
                b = r;
            } // n = 최대공약수

            answer = gop / n / 6;

        }
        return answer;
    }
}
