public class Solution {
    static long sum = 0;

    public static long sumFirstN(long n) {
        sum = 0;
        sumRecursive(n);
        return sum;
    }

    static void sumRecursive(long n) {
        if (n < 1) {
            return;
        }
        sum += n;
        sumRecursive(n - 1);
    }
}
