package f_17;

/*
 * Write a method to generate the first N prime numbers
 */

public class C_of_17 {
	
	public static int[] nPrimeNumbers(int bounds){
		int[] result = new int[bounds];
		int resultIndex = 1;
		
		int n = 20;
		int thisNum = 3;
		int counter = 2;
		boolean yes = true;

		if (counter == 2) {
			System.out.println("Prime Number List: \n2");
			result[0] = 2;
		}
		for (counter = 2; counter <= n;) {
			for (int j = 2; j < bounds; j++) {
				if (thisNum % j == 0) {
					yes = false;
				} else if (thisNum % 2 != 0 && thisNum % 3 != 0) {
					yes = true;
				}
				if (yes == true) {
					System.out.println(thisNum);
					result[resultIndex] += thisNum;
					resultIndex++;
					counter++;
				}
				yes = false;
				thisNum++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		nPrimeNumbers(20);

	}

}
