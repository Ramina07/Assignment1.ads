public class Problem8 {

    /**
     * Checks if the string consists only of digits using recursion.
     * Time complexity: O(n), where n is the length of the string.
     *
     * @param s      Input string
     * @param index  Current character index being checked
     * @return       True if all characters are digits, false otherwise
     */
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;                  // Base case: reached end of string
        if (!Character.isDigit(s.charAt(index))) return false; // If current char is not digit
        return isAllDigits(s, index + 1);                      // Recurse to next char
    }
}

