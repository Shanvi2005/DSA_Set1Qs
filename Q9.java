public class Solution {
    static int[] arr;

    public static int[] generateFibonacciNumbers(int n) {
        arr = new int[n];
        recursiveFibonacci(n);
        return arr;
    }

    static void recursiveFibonacci(int n) {
        if (n <= 0) {
            return;
        }

        arr[0] = 0;
        if (n > 1) {
            arr[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }
}
