package f_17;

/*
 * Write a program to print the P# of a given number
 */

public class D_of_17 {
	
	public static void printPrimorial(int p){
		
		p = 10;
		int base = 3;
		int counter = 2;
		boolean yes = true;
		long pNumReturn = 2;
		String pNumLength = "2";

		for (counter = 2; counter <= p;) {
			for (int j = 2; j < p; j++) {
				if (base % j == 0) {
					yes = false;
				} else if (base % 2 != 0 && base % 3 != 0) {
					yes = true;
				}
				if (yes == true) {
					counter++;
					pNumReturn = pNumReturn * base;
					pNumLength = pNumLength + "*" + base;
				}
				yes = false;
				base++;
			}
		}
		System.out.println(p + "# = " + pNumLength + " = " + pNumReturn);
		
	}

	public static void main(String[] args) {
		
		printPrimorial(10);
		
	}

}
