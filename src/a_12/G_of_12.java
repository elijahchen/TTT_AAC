package a_12;

/*
 *  s = 1/2 + 1/3 + ... + 1/100
 *  Ans: 4.18737751
 */

public class G_of_12 {

	private static double sumOf (int num){
		
		double s = 0;
		
		for (double i = 2 ; i <= num ; i++){
			
			s += 1/i;
			
		}
		
		return s;
	}

	public static void main(String[] args) {
		
		System.out.println(sumOf(100));
		
	}

}
