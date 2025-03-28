public class Problem2 {

    /**
     * Calculates the average of elements in the array using recursion.
     * Time complexity: O(n), where n is the array length.
     *
     * @param arr   Input array
     * @param index Current index in recursion
     * @param sum   Current sum of elements
     * @return      Average value as double
     */
    public static double findAverage(int[] arr, int index, int sum) {
        if (index == arr.length) {
            return (double) sum / arr.length;
        }
        return findAverage(arr, index + 1, sum + arr[index]);
    }
}

