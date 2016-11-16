package g_18;

/*
 * Generate Pascal's triangle using recursion
 */

public class E_of_18 {
	
	public static void printPascal(int n) {
		for (int i = 0; i < n; i++) {
			int space = 1;
			System.out.format("%" + (n - i) * 2 + "s", "");
			// ^ Fills the distance from the left margin with spaces
			for (int j = 0; j <= i; j++) {
				System.out.format("%4d", space);
				// ^ Spaces each number by 4 places
				space = space * (i - j) / (j + 1);
				// ^ Factorial of spaces!
			}
			System.out.println();
		}
	}

	public static int pascal(int i, int j) {
		if (j == 0 || i == j) {
			return 1;
		} else {
			return pascal(i - 1, j - 1) + pascal(i - 1, j);
		}
	}

	public static void main(String[] args) {
		
		printPascal(7);

	}
	
}
