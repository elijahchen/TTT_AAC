package a_12;

/*
 *  Print a table of F to C concersion from -40F to 100F for every degree
 *  Add a header
 */

import java.text.DecimalFormat;

public class C_of_12 {

	private static void ftoC(float min, double max) {

		System.out.println("F to C TABLE");

		for (double i = min; i <= max; i++) {

			double celsius = (i - 32) * (5.0 / 9.0);

			DecimalFormat thisFormat = new DecimalFormat("#");

			System.out.println(thisFormat.format(i) + "F " + " is " + thisFormat.format(celsius) + "C ");

		}

	}

	public static void main(String[] args) {

		ftoC(-40, 100);

	}

}
