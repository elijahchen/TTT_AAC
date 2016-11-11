package a_12;

/*
 * s = 1 + 2 + 3 + ... + 100
 * Ans: 5050
 */

public class E_of_12 {

	private static int sumOf(int num) {
		
		int s = 0;

		for (int i = 0; i <= num; i++) {
			s += i;
		}

		return s;
	}

	public static void main(String[] args) {
		
		System.out.println(sumOf(100));
		
	}
}
