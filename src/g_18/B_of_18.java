package g_18;

/*
 * Using recursion, solve each problem set in #12
 */

public class B_of_18 {
	
	public static void printFizzBuzz(int lowerBound, int upperBound) {
		if (lowerBound < upperBound) {
			if (lowerBound % 5 == 0 && lowerBound % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (lowerBound % 5 == 0) {
				System.out.println("Buzz");
			} else if (lowerBound % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(lowerBound);
			}
			printFizzBuzz(++lowerBound, upperBound);
		}
	}
	
	public static void printFtoC(int fDegreeLow, int fDegreeHigh) {
		if (fDegreeLow <= fDegreeHigh) {
			float celsius = (fDegreeLow - 32) * 5/9;
			System.out.println(fDegreeLow + " F \t | \t" + celsius + " C");
			printFtoC(++fDegreeLow, fDegreeHigh);
		}
	}
	
	public static void reversePrintFtoC(int fDegreeLow, int fDegreeHigh) {
		float celsius = 1;
		if (fDegreeLow >= fDegreeHigh) {
			celsius = (fDegreeLow - 32) * 5/9;
			System.out.println(fDegreeLow + " F \t | \t" + celsius + " C");
			reversePrintFtoC(--fDegreeLow, fDegreeHigh);
		}
	}
	
	public static int printSum(int n){
		int s = 0;
		if(n == 0){
			return 0;
		} else {
			s = n + printSum(n - 1);
		}
		return s;
	}
	
	public static int printDiff(int n){
		int s = 0;
		if(n == 0){
			return 0;
		} else {
			s = n + printDiff(n + 1);
		}
		return s;
	}
	
	public static double printFrac(double n){
		double s = 0;
		if(n == 2){
			return 1 / n;
		} else {
			s = (1 / n) + printFrac(n - 1);
			return s;
		}
	}
	
	//H
	public static int printSquare(int n){
		int s = 0;
		if(n == 1){
			return 1;
		} else {
			s = (n * n) + printSquare(n - 1); 
		}
		return s;
	}
	
	//I
	public static float printMultiplyFrac(float n){
		float s = 0;
		if(n == 2){
			return 1 / (n * (n + 1));
		} else {
			s = (1 / (n * (n + 1))) + printMultiplyFrac(n - 1);
		}
		
		return s;
	}
	
	//J
	public static double printMultiplyFrac2(double n){
		double s = 0;
		if(n == 5){
			return 1 / ((n-2) * n);
		} else {
			s = (1 / ((n - 2) * n)) + printMultiplyFrac2(n - 4);
		}
		return s;
	}
	
	
	public static void main(String[] args) {
		//A
		printFizzBuzz(1, 100);
		//B
		System.out.println("\nFahrenheit to Celsius from -40 to 100:");
		//C
		printFtoC(-40, 100);
		//D
		System.out.println("\nFahrenheit to Celsius from 100 to -40:");
		reversePrintFtoC(100, -40);
		//E
		System.out.println("\nE) s = " + printSum(100));
		//F
		System.out.println("\nF) s = " + printDiff(-200));
		//G
		System.out.println("\nG) s = " + printFrac(100));
		//H
		System.out.println("\nH) s = " + printSquare(100));
		//I
		System.out.println("\nI) s = " + printMultiplyFrac(100));
		//J
		System.out.println("\nJ) s = " + printMultiplyFrac2(97));
	}
}
