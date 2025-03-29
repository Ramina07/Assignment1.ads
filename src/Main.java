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

        // Problem 4: Factorial
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + Problem4.factorial(number));

        // Problem 5: Fibonacci
        int fib1 = 5;
        int fib2 = 17;
        System.out.println("Fibonacci of " + fib1 + ": " + Problem5.fibonacci(fib1));
        System.out.println("Fibonacci of " + fib2 + ": " + Problem5.fibonacci(fib2));

        // Problem 6: Power
        int a = 2, n = 10;
        System.out.println(a + "^" + n + " = " + Problem6.power(a, n));

        // Problem 7: Reverse Array
        int[] arr7 = {1, 4, 6, 2};
        System.out.print("Reversed array: ");
        Problem7.reverseArray(arr7, arr7.length - 1);
        System.out.println(); // to go to a new line

        // Problem 8: Check if string is all digits
        String s1 = "123456";
        String s2 = "123a12";
        System.out.println("\"" + s1 + "\" is all digits? " + Problem8.isAllDigits(s1, 0));
        System.out.println("\"" + s2 + "\" is all digits? " + Problem8.isAllDigits(s2, 0));

        // Problem 9: Binomial Coefficient
        int n1 = 2, k1 = 1;
        int n2 = 7, k2 = 3;
        System.out.println("C(" + n1 + "," + k1 + ") = " + Problem9.binomialCoefficient(n1, k1));
        System.out.println("C(" + n2 + "," + k2 + ") = " + Problem9.binomialCoefficient(n2, k2));







    }
}
