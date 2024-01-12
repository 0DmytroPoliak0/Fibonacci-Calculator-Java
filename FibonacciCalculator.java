/*
* Fibonacci Calculator Program
* */

import java.util.Scanner;

public class FibonacciCalculator {

    private static final int MAX_N = 100;
    private static long[] memo = new long[MAX_N];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get user input for the Fibonacci term to calculate
        System.out.print("Enter a non-negative integer n to calculate Fibonacci: ");
        int n = scanner.nextInt();

        // Record the start time for performance measurement
        long startTime = System.nanoTime();

        try {
            // Calculate Fibonacci and print the result
            long result = calculateFibonacci(n);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            // Catch block for handling the specific exception thrown
            System.out.println("An IllegalArgumentException occurred: " + e.getMessage());
        }

        // Calculate and print the time spent on the calculation
        long estimatedTime = System.nanoTime() - startTime;
      //  double estimatedTimeInSeconds = (double) estimatedTime / 1_000_000_000; // Convert nanoseconds to seconds
       // double estimatedTimeInMilliseconds = (double) estimatedTime / 1_000_000; // Convert nanoseconds to milliseconds
        double estimatedTimeInNanoseconds = (double) estimatedTime; // nanoseconds

       // System.out.println("Time spent: " + estimatedTimeInSeconds + " seconds");
       // System.out.println("Time spent: " + estimatedTimeInMilliseconds + " milliseconds");
        System.out.println("Time spent: " + estimatedTimeInNanoseconds + " nanoseconds");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    /**
     * Recursively calculates the nth term of the Fibonacci series.
     *
     * @param n The term to calculate (non-negative integer).
     * @return The nth term of the Fibonacci series.
     * @throws IllegalArgumentException if n is less than 0.
     */
    public static long calculateFibonacci(int n) {
        // Base case: If n is less than 0, throw an exception
        if (n < 0) {
            throw new IllegalArgumentException("Number should not be less than zero");
        }
        // Base cases: F(0) and F(1)
        else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Recursive case: F(n) = F(n-1) + F(n-2)
        if (memo[n] == 0) {
            memo[n] = calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
        return memo[n];
    }
}
