package d_15;

/*]
 * Given this string "USA, Canada, Mexico, Bermuda, Grenada, Belize"
 * -Create an array that contains these countries with ',' being the delimiter
 * -Make sure your program works when you add or remove countries from your string
 * -Change your program so that the delimiter can be easily changed
 */

public class I_J_K_of_15 {
	
	private static String[] stringToArray(String s, String delimitWithThese) {
		
		char[] A = s.toCharArray();
		char[] B = delimitWithThese.toCharArray();
		int elements = 0;
		String temp = "";
		boolean flag = false;
		boolean previousFlag = false;
		
		for(int i = 0; i < A.length; i++){
			previousFlag = flag;
			flag = false;
			for(int j = 0; j < B.length; j++){
				if(B[j] == A[i]){
					flag = true;
					if(!previousFlag){
						elements++;
					}
				}
			}
			if(!flag){
				temp += A[i];
			} else {
				temp += ',';
			}
		}
		
		String[] result = new String[elements];
		char[] temp1 = temp.toCharArray();
		int index = 0;
		temp = "";
		flag = false;
		
		for(int i = 0; i < temp1.length; i++){
			previousFlag = flag;
			flag = false;
			if(temp1[i] == ','){
				flag = true;
				if(!previousFlag){
					result[index] = temp;
					temp = "";
					if(i != 0){
						index++;
					} else {
						result = new String[elements-1];
					}
				}
			} else {
				temp += temp1[i];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		String string = "@?.!USA,%%@ Canada, Mexico!!!, Bermuda,(& Grenada,Belize)#";
		
		String delim = ",.!@#$%?^&*(/)+=_~><_ ";
		
		for(int i = 0; i < stringToArray(string, delim).length; i++){
			System.out.println("Index [" + i + "] = " + stringToArray(string, delim)[i]);
		}
				
	}
	
}
