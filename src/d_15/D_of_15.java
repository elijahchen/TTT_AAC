package d_15;

/*
 * Write a function to find the position at which the substring "indifferent" appears above.
 */

public class D_of_15 {

	private static void doesItExist(String a, String b) {

		char[] A = a.toLowerCase().toCharArray();
		char[] B = b.toLowerCase().toCharArray();
		boolean foundWord = true;
		int counter = 0;
		
		for(int i = 0; i < A.length && (i + B.length) <= A.length; i++){
			if(B[0] == A[i]){
				foundWord = true;
				for(int j = 1; j < B.length; j++){
					if(A[i+j] == B[j]){
						foundWord = true;
					} else {
						foundWord = false;
						break;
					}
				}
				if(foundWord == true){
					counter+=1;
					System.out.println("The word " + b + " was found at index: " + i + " and ends at " +
							(i + B.length) + ".");
				}
			}
		}
		if(counter == 0){
			System.out.println("The word " + b + " was NOT found!");
		}
	}

	public static void main(String[] args) {
		
		String myQuote = "\"Mr.Fay, is this going to be a battle of wits?\" \"If it is,\"was the indifferent retort, \"you have come unarmed!\"";
		
		doesItExist(myQuote, "indifferent");
		doesItExist(myQuote, "unarmed!\"");

	}

}
