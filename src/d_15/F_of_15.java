package d_15;

/*
 * Create a substring of the above string that contains the following
 */

public class F_of_15 {

	private static String substringThis(String a){
		String substring = "";
		String b =  "you have come unarmed!";
		
		char[] A = a.toLowerCase().toCharArray();
		char[] B = b.toLowerCase().toCharArray();
		
		for(int i = 0; i < A.length && (i + B.length) <= A.length; i++){
			if(B[0] == A[i]){
				substring = ""+A[i];
				for(int j = 1; j < B.length; j++){
					if(A[i+j] == B[j]){
						substring += A[i+j];
					} else {
						break;
					}
				}
			}
		}
		
		return substring;
	}

	public static void main(String[] args) {
		
		String myQuote = "\"Mr.Fay, is this going to be a battle of wits?\" \"If it is,\"was the indifferent retort, \"you have come unarmed!\"";
		
		System.out.println(substringThis(myQuote));

	}

}
