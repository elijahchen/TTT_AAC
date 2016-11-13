package b_13;

import java.text.DecimalFormat;

/*
 *  S = sqrt( 6 * ( 1 + (1/2*2) + (1/3*3) + (1/4*4) + ... + (1/*n*n))
 *  Evaluate S if n = 100
 *  Calculate the value of n if s = PI to 6 decimal places
 */

public class B_of_13 {

	private static double evaluateS(double num) {

		double s = 0;
		double sum = 0;
		double n = 2.0;

		DecimalFormat thisFormat = new DecimalFormat("#.000000");

		while (s != num) {
			if (n == 2) {
				sum += 1.0;
			}
			sum = sum + (1.0 / (n * n));

			s = Math.sqrt(6 * sum);
			s = Double.parseDouble((thisFormat.format(s)));
			if (n == 100) {
				System.out.println("If n = 100, S = " + s);
			}
			if (s != num) {
				s = 0;
			}
			n++;
		}
		return n;
	}

	public static void main(String[] args) {

		System.out.println("If S = 3.141592, " + "n = " + (int) evaluateS(3.141592));

	}

}
