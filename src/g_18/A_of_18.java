package g_18;

/*
 * Calculate factorial of a number using recursion
 */

public class A_of_18 {
	
	public static int factorial(int a) {
		if (a == 1) {
			return 1;
		} else {
			return a * factorial(a - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(6));
	}
}
