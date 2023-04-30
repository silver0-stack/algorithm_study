
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int gop = denom1 * denom2;

        // 최대공약수
        int gcd = gcd(denom1, denom2);

        // 최대공배수
        int lcm = gop / gcd;

        if (denom1 != lcm) {
            numer1 = numer1 * (lcm / denom1);
        }

        if (denom2 != lcm) {
            numer2 = numer2 * (lcm / denom2);
        }

        int bunja = numer1 + numer2;

        int[] answer = { bunja, lcm };

        int max = gcd(bunja, lcm);

        answer[0] /= max;
        answer[1] /= max;

        return answer;
    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}
