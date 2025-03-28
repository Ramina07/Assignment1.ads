public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        System.out.println("Minimum is: " + Problem1.findMin(arr, 0));

        // Problem 2: Find Average
        int[] arr2 = {3, 2, 4, 1};
        System.out.println("Average is: " + Problem2.findAverage(arr2, 0, 0));

        // Problem 3: Check Prime
        int num1 = 7;
        int num2 = 10;
        System.out.println(num1 + " is prime? " + Problem3.isPrime(num1, 2));
        System.out.println(num2 + " is prime? " + Problem3.isPrime(num2, 2));
    }
}
