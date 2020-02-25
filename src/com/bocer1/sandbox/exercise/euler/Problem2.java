package com.bocer1.sandbox.exercise.euler;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */
public class Problem2 {
    public static void main(String[] args) {
        System.out.println(getSumEvenFibTerms(4000000));
    }

    private static long getSumEvenFibTerms(final long upperBound) {
        long prev = 1;
        long curr = 2;

        long sum = 0;
        while (curr < upperBound) {
            if(curr %2 == 0) {
                sum += curr;
                System.out.println("curr = " + curr + ", sum = " + sum);
            }
            long nextCurr = prev + curr;
            prev = curr;
            curr = nextCurr;
        }

        return sum;
    }
}
