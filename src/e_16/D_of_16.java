package e_16;

/*
 * Write a program to input a sentence and print the number of character found in the longest word of the given sentence
 * -S = "USA is my Country" then output should be 7
 */

public class D_of_16 {
	
	private static int longestWord(String s){
		int result = 0;
		char[] A = s.toCharArray();
		String longest = "";
		String temp = "";
		
		for(int i = 0; i < A.length; i++){
			if(A[i] == ' '){
				if(temp.length() > longest.length()){
					longest = temp;
				}
				temp = "";
				i++;
			} else if (i == s.length()-1 && temp.length() > longest.length()){
				temp += A[i];
				longest = temp;
			}
			temp += A[i];
		}
		
		return result = longest.length();
	}
	
	public static void main(String[] args) {
		
		String s = "USA is my Country";
		System.out.println(longestWord(s));
		
	}

}
