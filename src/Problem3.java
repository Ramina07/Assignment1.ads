public class Problem3 {

    /**
     * Checks whether the number n is a prime number using recursion.
     * Time complexity: O(√n), since we check up to sqrt(n).
     *
     * @param n        Number to check
     * @param divisor  Current divisor (start from 2)
     * @return         True if n is prime, false otherwise
     */
    public static boolean isPrime(int n, int divisor) {
        if (n < 2) return false;                  // Numbers less than 2 are not prime
        if (divisor * divisor > n) return true;   // No divisors found — number is prime
        if (n % divisor == 0) return false;       // Found a divisor — number is not prime
        return isPrime(n, divisor + 1);           // Check next divisor
    }
}

