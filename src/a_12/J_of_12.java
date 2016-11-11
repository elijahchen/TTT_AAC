package a_12;

import java.text.DecimalFormat;

/*
 *  s = 1/(3*5) + 1/(7*9) + ... + 1/(95*97)
 */

public class J_of_12 {

	private static double sumOf(double num) {

		double s = 0;

		for (double i = 3; i <= num; i+=4) {

			s += 1/(i*(i+2));

		}

		return s;
	}

	public static void main(String[] args) {
		
		DecimalFormat thisFormat = new DecimalFormat("#.00000");
		
		System.out.println(thisFormat.format(sumOf(95)));

	}

}
