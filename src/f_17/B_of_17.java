package f_17;

/*
 *  Write a function to find the nth power of an integer from first
 *  principles e.g. 35 Do not use the built-in power method.
 */

public class B_of_17 {
	
	private static int nthPower(int a, int b){
		int result = a;
		
		for (int i = 1; i < b; i++) {
			result *= a;
			System.out.println(result);
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		nthPower(3, 5);
		
	}

}
