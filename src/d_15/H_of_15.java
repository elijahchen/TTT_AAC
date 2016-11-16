package d_15;

/*
 *  Create a new string which is a concatenation of all the array elements.
 *  A. Check that the length of individual strings when added equals the length of the final string
 *  B. Make sure your program works with an array with no elements
 */

public class H_of_15 {

	private static String combineThis(String[] s) {

		String result = "";
		int total = 0;

		for (int i = 0; i < s.length; i++) {
			char[] temp = s[i].toCharArray();
			total += s[i].length();
			for (int j = 0; j < s[i].length(); j++) {
				result += temp[j];
			}
		}

		if (s.length == 0) {
			System.out.println("Your string array is empty!");
		} else {
			System.out.println(total + " : " + result.length());
			if (total == result.length()) {
				System.out.println("Length matches!");
			} else {
				System.out.println("Length does not match!");
			}
		}

		return result;
	}

	public static void main(String[] args) {

		String[] needsCombining = { "Combine", "this", "array" };
		System.out.println("Result: " + combineThis(needsCombining));

		String[] arrayWithNothing = {};
		System.out.println("Result: " + combineThis(arrayWithNothing));

	}

}
