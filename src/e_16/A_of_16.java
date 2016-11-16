package e_16;

/*
 * Write a program to check whether a string is a palindrome or not.
 */

public class A_of_16 {

	private static boolean palindrome(String s) {

		char[] A = s.toLowerCase().toCharArray();
		boolean yes = false;

		for (int i = 0, j = A.length - 1; i < A.length; i++,j--) {
			if(A[i] == A[j]){
				yes = true;
			} else {
				yes = false;
				break;
			}
		}

		return yes;
	}

	public static void main(String[] args) {
		String checkThis = "aHeleeleHA";
		System.out.println(palindrome(checkThis));
		
	}

}
