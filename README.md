# Fibonacci Calculator

This program calculates the nth term of the Fibonacci series using a recursive algorithm with memoization. It also measures the time spent on the calculation and reports the result.

## Author
- **Student Name:** Dmytro Poliak
- **Student Number:** 100443432

## Usage
1. Compile the program using a Java compiler.
2. Run the compiled program.
3. Enter a non-negative integer `n` when prompted.
4. The program will calculate and display the Fibonacci result for the entered `n`.
5. The time spent on the calculation will be printed in nanoseconds.

## Implementation Details

### Fibonacci Calculation
The program utilizes a recursive approach with memoization to calculate Fibonacci numbers efficiently. The result for each Fibonacci term is stored in an array (`memo`), and if the term has already been calculated, it is retrieved from the array, avoiding redundant computations.

### Time Measurement
The program measures the time spent on the calculation using `System.nanoTime()` and reports the result in nanoseconds.

## Considerations
- The program includes input validation, throwing an `IllegalArgumentException` if the entered `n` is less than 0.

## Compilation and Execution
Compile the program using a Java compiler (e.g., `javac FibonacciCalculator.java`) and run the compiled program (`java FibonacciCalculator`).

## Note
- The program supports a maximum value of `n` defined by `MAX_N` (currently set to 100) due to memoization constraints.

## Optimization
For larger Fibonacci terms, consider alternative algorithms, such as an iterative approach, for further performance improvement.

