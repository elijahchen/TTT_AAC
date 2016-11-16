package f_17;

public class E_of_17 {

	private static void awesomeMethod(int[][] a) {

		String printThis = "";
		int n = 0; // Increment to next value
		int m = 0; // Incremental space filler

		for (int row1 = 0; row1 < a.length; row1++) {
			for (int row2 = n; row2 < a[row1].length; row2++) {
				printThis = printThis + a[row1][row2] + " ";
			}
			printThis = printThis + "\n";
			n++;
			while (m < n) {
				printThis = printThis + "  ";
				m++;
				if(m > 1){
					for (int z = 2; z <= m; z++) {
						printThis = printThis + "  ";
					}
				}
			}
		}
		System.out.println(printThis);

	}

	public static void main(String[] args) {

		int[][] A = { 
				{ 2, 3, 1, 5, 0 }, 
				{ 7, 1, 5, 3, 1 }, 
				{ 2, 5, 7, 8, 1 }, 
				{ 0, 1, 5, 0, 1 }, 
				{ 3, 4, 9, 1, 5 }, 
				};

		awesomeMethod(A);

	}

}
