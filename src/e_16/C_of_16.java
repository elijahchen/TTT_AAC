package e_16;

/*
 * Write a program which receives a text string and a search string
 * -Counts all occurrences of the search string in given text string
 */

public class C_of_16 {
	
	private static int searchText(String a, String b){
		int result = 0;
		char[] A = a.toLowerCase().toCharArray();
		char[] B = b.toLowerCase().toCharArray();
		boolean found = false;
		
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < B.length; j++){
				if(B[0] == A[i]){
					found = true;
					int temp = 1;
					while(found){
						if(B[temp] == A[i+temp] && (A.length - i) > B.length){
							temp++;
							if(temp == B.length && found == true){
								break;
							}
						} else {
							found = false;
							break;
						}
					}
					temp = 1;
					if(found){
						result++;
						break;
					}
				}
			}
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		
		String blockOfText = "ZK01 Toshiba Disk Drive MK1255GSX HDD2H26 ZK01 ZK0A, Do not remove any labels.";
		String findThis = "ZK01";
		
		System.out.println(searchText(blockOfText, findThis));

	}

}
