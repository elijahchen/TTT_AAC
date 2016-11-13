package b_13;

/*
 * A- s = 1/2 + 1/3 + ... + 1 / n + 1 |ANS: 82
 */

public class A_of_13 {

	public static void main(String[] args) {

		double x = 2.0;
		double n = 1.0;
		double sum = 0;

		while (n < 82) {
			if (x > 4) {
				double t = 1 / (n + 1);
				sum = sum + t;
				n++;
			} else {
				double t = 1 / x;
				sum = sum + t;
				x++;
			}
		}

		System.out.println(sum);
		System.out.println(n);

	}

}
