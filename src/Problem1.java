public class Problem1 {

    /**
     * Returns the minimum element in the given array.
     * Time complexity: O(n), where n is the number of elements in the array.
     */
    public static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        return Math.min(arr[index], findMin(arr, index + 1));
    }
}

