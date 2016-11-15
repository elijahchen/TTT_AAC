package d_15;

/*
 *  Given two strings: write a function that prints true if they are equal and false if not
 */

public class A_of_15 {
	
	private static boolean doesItEqual(String a, String b){
		
		char[] A = a.toCharArray();
		char[] B = b.toCharArray();
		
		for(int i = 0; i < a.length(); i++){
			if(A[i] != B[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(doesItEqual("Hello", "Hello"));

	}

}
