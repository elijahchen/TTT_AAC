package f_17;

/*
 * Binary Search
 * -Sort the array
 * -Write a program to search for a specific number within your sorted array
 * -If the array has 1024, approximately how many steps are needed before the search is complete
 * -What is the number of steps if the array has N elements
 */

public class H_of_17 extends C_of_17{

	private static boolean findNumber(int[] a, int b){
		
		int loop = 1;
		int start = 0;
		int end = a.length - 1;
		boolean found = false;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (b == a[mid]) {
				System.out.println(b + " was found at index " + mid);
				found = true;
				break;
			} else if (b < a[mid]) {
				end = (mid - 1);
			} else if (b > a[mid]) {
				start = (mid + 1);
			}
			loop++;
		}

		if (found == false) {
			System.out.println(b + " cannot be found.");
		} else {
			System.out.println(b + " was found in " + loop + " tries.");
		}
		
		return found;
	}
	
	public static void main(String[] args) {
		
		int[] nList = nPrimeNumbers(20);
		int num = 23;
		
		findNumber(nList, num);
		
	}

}
