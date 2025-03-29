public class Problem6 {

    /**
     * Calculates a raised to the power of n using recursion.
     * Time complexity: O(n)
     *
     * @param a Base number
     * @param n Power (non-negative)
     * @return  a raised to the power n (a^n)
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;             // Base case: a^0 = 1
        return a * power(a, n - 1);       // Recursive step: a * a^(n-1)
    }
}
