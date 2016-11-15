package c_14;

/*
 * Calculate S defined below. Do it in three steps: First write the
 * algorithm, create a flowchart and finally implement it in Java
 * 
 *  S = (1*1+1*2+...+1*50) + (2*1+2*2+...++2*50) + ... + (100*1+100*2+...+100+50)
 *  Ans: 6438750
 *  
 *  Print all combinations of these three numbers: 1, 2, 3
 */
public class A_of_14 {

	private static int calculateS() {
		int x;
		int y;
		int sum = 0;

		for (x = 1; x < 101; x++) {
			for (y = 1; y < 51; y++) {
				int t = x * y;
				sum = sum + t;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println(calculateS());

		int[] myArray = { 1, 2, 3 };

		for (int x = 0; x < myArray.length; x++) {
			for (int y = 0; y < myArray.length; y++) {
				for (int z = 0; z < myArray.length; z++) {

					if (x != y && y != z && z != x) {
						System.out.println(myArray[x] + "" + myArray[y] + "" + myArray[z]);
					}
				}
			}
		}

	}
}
