class Solution {
    public int monkeyMove(int n) {
        long mod = 1_000_000_007;
        long total = fastPower(2, n, mod);
        return (int)((total - 2 + mod) % mod);
    }

    long fastPower(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
