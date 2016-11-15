package d_15;

/*
 * Create an array that contains the positions of all commas i.e. "," in the above sentence.
 */

public class E_of_15 {
	
	private static int[] containsThis(String a, String c){
		
		char[] A = a.toLowerCase().toCharArray();
		char[] C = c.toLowerCase().toCharArray();
		int size = A.length;
		int[] temp = new int[size];
		int index = 0;
		
		for(int i = 0; i < size;i++){
			if(A[i] == C[0]){
				temp[index] = i;
				index++;
			}
		}
		
		int[] position = new int[index];
		
		for(int j = 0; j < index; j++){
			System.out.println(c +" found at: " + temp[j]);
			position[j] = A[j];
		}
		
		if(index == 0){
			System.out.println(c + " was not found");
		}
		
		return position;
	}

	public static void main(String[] args) {
		String myQuote = "\"Mr.Fay, is this going to be a battle of wits?\" \"If it is,\"was the indifferent retort, \"you have come unarmed!\"";
		
		containsThis(myQuote, ",");
		containsThis(myQuote, "?");
		containsThis(myQuote, "e");
		containsThis(myQuote, "9");

	}

}
