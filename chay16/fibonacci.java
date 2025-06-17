import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] memo = new long[100];
        System.out.println(fibMemoization(30, memo));
        System.out.println(fibMemoization(50, memo));
        System.out.println(fibMemoization(70, memo));
        System.out.println(fibMemoization(99, memo));
        System.out.println(Arrays.toString(memo));
    }

    public static long fibMemoization(int n, long[] memo) {
        if (n == 0 || n == 1)
            return n;

        if (memo[n] != 0)
            return memo[n];

        long val = fibMemoization(n - 1, memo) + fibMemoization(n - 2, memo);
        memo[n] = val;
        return val;
    }
}
