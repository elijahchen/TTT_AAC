package a_12;

import java.text.DecimalFormat;

/*
 *  s = 1/(2*3) + 1/(3*4) + 1/(4*5) + ... + 1/(99*100)
 *  Ans: 0.49
 */

public class I_of_12 {
	
	private static double sumOf(double num) {

		double s = 0;

		for (double i = 2; i <= num; i++) {

			s += 1/(i*(i+1));

		}

		return s;
	}

	public static void main(String[] args) {
		
		DecimalFormat thisFormat = new DecimalFormat("#.00");
		
		System.out.println(thisFormat.format(sumOf(100)));

	}
	
}
