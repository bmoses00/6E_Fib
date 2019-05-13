/**
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1

  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /**
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if (n <= 2) // decision between base and recursive cases
            return 1; // solution to base case
        else // solution to recursive case
            return fib_recurrence(n - 1) + fib_recurrence(n - 2);
            // recursive abstraction
    }
     /* These are class methods because they do not vary
     based on an individual "Fib" object, in fact having a
     "Fib" object would not make sense.
    */


    /**
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        int first = 1;
        int second = 1;
        int previousSecond;
        for (int counter = 2; counter < n; counter++) {
            // compute fibonacci numbers based on recurrence releation
            previousSecond = second;
            second += first;
            first = previousSecond;
        }
        return second;
    }
    /* Time complexity:
       Consider the size of the problem to be n

       As the proxy for the time required, count mathematical operations

       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because the problem runs through a 'for' loop, running a static number
       of calculations for each 'n'
     */


    /**
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;

        return Math.floor(
        (Math.pow(phi, n) - Math.pow(psi, n))
            / Math.sqrt(5));
    }
    /* Time complexity: Constant
       Consider the size of the problem to be n

       As the proxy for the time required, count mathematical operations

       Then cost of the Binet algorithm does not grow
       as the size of the problem increases,
       because the number of operations is independant of the size
     */
}
