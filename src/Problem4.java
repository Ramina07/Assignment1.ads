public class Problem4 {

    /**
     * Calculates factorial of a number n using recursion.
     * Time complexity: O(n)
     *
     * @param n Number  to calculate factorial for
     * @return  Factorial of n (n!)
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;      // Base case: 0! = 1, 1! = 1
        return n * factorial(n - 1);         // Recursive step: n * (n-1)!
    }
}

