package f_17;

/*
 * A- Write a function to swap two integers. 
 * -Do this in three different ways
 * -Using a temp variable
 * -Without using a temp variable c
 * -Using bit shift operators
 */

public class A_of_17 {

	public static void main(String[] args) {
		
		int a = 128;
		int b = 12;
		
		int c;
		c = b;
		b = a;
		a = c;

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		a = (a >> 4) | b;
		b = (b >> 3) << 7;

	}

}
