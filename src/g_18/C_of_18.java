package g_18;

/*
 * Reverse a string with recursion
 */

public class C_of_18 {

		public static String printReverse(String s){
			String result = "";
			if(s.length() == 1){
				return s;
			} else {
				int length = s.length() - 1;
				result = s.charAt(length) + printReverse(s.substring(0, length));
			}
			return result;
		}
		
		public static void main(String[] args) {
			
			System.out.println(printReverse("Mississppi"));
			
		}

}
