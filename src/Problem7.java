public class Problem7 {

    /**
     * Prints elements of the array in reverse order using recursion.
     * Time complexity: O(n)
     *
     * @param arr   Input array
     * @param index Current index (start from arr.length - 1)
     */
    public static void reverseArray(int[] arr, int index) {
        if (index < 0) return;                  // Base case: end of array
        System.out.print(arr[index] + " ");     // Print current element
        reverseArray(arr, index - 1);           // Recurse with previous index
    }
}

