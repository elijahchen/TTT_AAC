package g_18;

/*
 * Write a recursive program to convert an alphanumeric such as "3.14159"
 * to the appropriate numeric data type.
 * -Use recursion and ascii value of character
 * -If it is larger than a double print an error
 * -If there is no decimal point, use int or long or print an error message (from above)
 */

public class D_of_18 {

	public static double alphaConvert(String s, int i, int d) {
		double result = 0;
		char[] arr = s.toCharArray();

		if (i == s.length())
			return 0;

		if (arr[i] == '.') {
			d++;
			i++;
		}

		if (d != 0) {
			int n = arr[i] - 48;
			result = result + (n / Math.pow(10, d));
			alphaConvert(s, i + 1, d + 1);
		} else {
			int n = arr[i] - 48;
			result = result * 10 + n;
			alphaConvert(s, i + 1, d);
		}

		if (i == arr.length - d && d != 0) {

			if (result < Float.MAX_VALUE) {
				System.out.println("Result = Float");
				return (float) result;
			} else if (result < Double.MAX_VALUE) {
				System.out.println("Result = Double");
				return (double) result;
			} else {
				System.out.println("ERROR");
			}

		} else if (i == arr.length - d & d == 0) {
			if (result < Integer.MAX_VALUE) {
				System.out.println("Result = Integer");
				return (int) result;
			} else if (result < Long.MAX_VALUE) {
				System.out.println("Result = Long");
				return (long) result;
			} else {
				System.out.println("ERROR");
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(alphaConvert("3.14159", 0, 0));
		
	}
}
