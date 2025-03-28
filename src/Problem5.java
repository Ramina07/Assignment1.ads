public class Problem5 {

    /**
     * Returns the nth Fibonacci number using recursion.
     * Time complexity: O(2^n) — exponential due to repeated calls.
     *
     * @param n Index in Fibonacci sequence (0-based)
     * @return  nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;                // F(0) = 0
        if (n == 1) return 1;                // F(1) = 1
        return fibonacci(n - 1) + fibonacci(n - 2); // F(n) = F(n-1) + F(n-2)
    }
}

