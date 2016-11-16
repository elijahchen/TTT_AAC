package d_15;

/*
 * Write a function to replace the word "indifferent" above with "nonchalant" in myQuote.
 */

public class G_of_15 {

	private static String replaceWord(String a, String b, String c) {

		char[] A = a.toCharArray();
		char[] B = b.toCharArray();
		String d = "";
		int counter = 0;
		boolean foundWord = false;

		for (int i = 0; i < A.length && (i + B.length) <= A.length; i++) {
			if (B[0] == A[i]) {
				for (int j = 1; j < B.length; j++) {
					if (A[i + j] == B[j]) {
						if (B.length - 1 == j) {
							foundWord = true;
							break;
						}
					} else {
						foundWord = false;
						break;
					}
				}
				if (foundWord) {
					counter += 1;
					System.out.println(
							"The word " + b + " was found at index: " + i + " and ends at " + (i + B.length) + ".");
				}
			}
			if (foundWord) {
				d += c;
				i += (B.length - 1);
				foundWord = false;
			} else {
				d += A[i];
				if (!foundWord && (i + B.length) == A.length) {
					for (int k = (i + 1); k < A.length; k++) {
						d += A[k];
					}
				}
			}
		}
		if (counter == 0) {
			System.out.println("The word " + b + " was NOT found!");
		}

		return d;
	}

	public static void main(String[] args) {
		
		String myQuote = "\"Mr.Fay, is this going to be a battle of wits?\" \"If it is,\"was the indifferent retort, \"you have come unarmed!\"";

		System.out.println(replaceWord(myQuote, "indifferent", "nonchalant"));

	}

}
