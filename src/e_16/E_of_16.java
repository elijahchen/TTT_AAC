package e_16;

/*
 * Write a program to input a string to upper case and print the frequency for each character.
 */

public class E_of_16 {
	
	private static void letterCounter(String s){

		char[] A = s.toUpperCase().toCharArray();
		int hits = 0;

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {

				// DOES J EXIST BEFORE I AND DOES IT EQUAL
				if (A[i] == A[j] && j < i) {
					break;
				}
				// DOES IT EQUAL
				if (A[i] == A[j]) {
					hits += 1;
				}
				// ARE WE THERE YET
				if (j == A.length - 1) {
					System.out.println("The letter " + A[i] + " occurs " + hits + " times");
				}
			}
			hits = 0;
		}
	}
	
	public static void main(String[] args) {
		
		String string = "SDKMFsdoifjhsdufhewfnF141415151516116HQfhhf#$**2o35j2UZZ$@(%JijdfgZolasdsijhf";
		letterCounter(string);
		
	}

}
