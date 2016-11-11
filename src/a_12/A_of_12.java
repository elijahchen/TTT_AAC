package a_12;

/*
 *  Print numbers 1 to 100
 *  Multiples of 3 print Fizz
 *  Multiples of 5 print Buzz
 *  Multiples of 3 & 5 print FizzBuzz
 */

public class A_of_12 {

	private static void fizzBuzz(int num) {

		for (int i = 0; i <= num; i++) {

			if (i % 5 == 0) {

				if (i % 3 == 0) {

					System.out.println("FizzBuzz");

				} else {

					System.out.println("Buzz");
				}

			} else if (i % 3 == 0) {

				System.out.println("Fizz");

			} else {

				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {

		fizzBuzz(100);

	}

}
