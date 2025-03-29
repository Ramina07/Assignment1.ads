public class Problem9 {

    /**
     * Calculates the binomial coefficient C(n, k) using recursion.
     * Formula: C(n, k) = C(n-1, k-1) + C(n-1, k)
     * Base cases: C(n, 0) = C(n, n) = 1
     * Time complexity: O(2^n)
     *
     * @param n Total number of elements
     * @param k Number of chosen elements
     * @return  Binomial coefficient C(n, k)
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;  // Base cases
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
