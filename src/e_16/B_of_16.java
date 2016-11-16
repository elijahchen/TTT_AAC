package e_16;

/*
 * Write a program to accept a word
 * -Convert it into lower case
 * -Display the word by replacing only the vowels
 * -Replace the vowels with the next character in the alphabet following it
 */

public class B_of_16 {
	
	private static String iHateVowels(String s){
		String result = "";
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		char[] A = s.toLowerCase().toCharArray();
		boolean didItMatch = false;
		
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < vowels.length; j++){
				if(A[i] == vowels[j]){
					didItMatch = true;
					break;
				} else {
					didItMatch = false;
				}
			}
			if(didItMatch){
				result += (char)(A[i]+1);
			} else {
				result += A[i];
			}
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		String fixThisString = "Computer";
		
		System.out.println(iHateVowels(fixThisString));
		
	}

}
