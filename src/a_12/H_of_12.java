package a_12;

/*
 *  s = 1^2 + 2^2 + 3^2 + ... + 100^2
 *  Ans: 338350
 */

public class H_of_12 {

	private static int sumOf(int num) {

		int s = 0;

		for (int i = 1; i <= num; i++) {

			s += (i * i);

		}

		return s;
	}

	public static void main(String[] args) {

		System.out.println(sumOf(100));

	}
}
