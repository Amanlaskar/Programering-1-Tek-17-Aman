package loops;

import java.util.Scanner;

public class While3 { // Save as "SumAndAverage.java"
	public static void main(String[] args) {
		int sum = 0; // Store the accumulated sum, init to 0
		double average; // average in double
		int lowerbound = 1; // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum

		// Use a for-loop to sum from lowerbound to upperbound
		for (int number = lowerbound; number <= upperbound; ++number) {
			sum += number; // same as "sum = sum + number"
		}
		// Compute average in double. Beware that int/int produces int.

		// Print sum and average.

	}
}