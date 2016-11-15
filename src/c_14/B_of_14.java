package c_14;

/*B- Multiply these two matrices
 * ([1,2,3],[3,2,1],[2,1,3]) * ([4,5,6],[6,5,4],[4,6,5])
 * ANS:([28,33,29],[28,31,31],26,33,31])
*/

public class B_of_14 {
	
	private static void productOf(int[][] a, int[][] b){
		
		int[][] c = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(c[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		
		int arrayA[][] = { { 1, 2, 3 }, { 3, 2, 1 }, { 2, 1, 3 } };
		int arrayB[][] = { { 4, 5, 6 }, { 6, 5, 4 }, { 4, 6, 5 } };
		
		productOf(arrayA, arrayB);

	}

}
