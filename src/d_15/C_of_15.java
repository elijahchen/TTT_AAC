package d_15;

/*
 * Write a method to find the length of the string. Do not use the built-in .length() method.
 */

public class C_of_15 {

	private static int lengthOf(String a){
		int length = 0;
		char[] A = a.toCharArray();
		
		for(char c : A){
			length++;
		}
		return length;
	}
	
	public static void main(String[] args) {
		
		String myQuote = "\"Mr.Fay, is this going to be a battle of wits?\" \"If it is,\"was the indifferent retort, \"you have come unarmed!\"";
		System.out.println(lengthOf(myQuote));
		
	}

}
