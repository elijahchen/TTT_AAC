package a_12;

import java.text.DecimalFormat;

/*
*  Print a table of F to C concersion from 100F to 40F for every degree
*/

public class D_of_12 {

	private static void ftoC(float min, double max) {

		System.out.println("F to C TABLE");

		for (double i = min; i >= max; i--) {

			double celsius = (i - 32) * (5.0 / 9.0);

			DecimalFormat thisFormat = new DecimalFormat("#");

			System.out.println(thisFormat.format(i) + "F " + " is " + thisFormat.format(celsius) + "C ");

		}

	}

	public static void main(String[] args) {

		ftoC(100, 40);

	}

}
