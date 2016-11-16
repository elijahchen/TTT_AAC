package f_17;

/*
 * Write a program that displays an amount in dollars in terms of bills of different denominations
 * Amount $782 is displayed as:
 * Denomination 100, 50, 20, 10, 5, 2, 1
 * Number of bills 7, 1 , 1, 1, 0, 1, 0
 * Make sure that that a minimum number of bills are used
 */

public class F_of_17 {

	private static void numberOfBills(int totalCost) {
		int copyCost = totalCost;
		int[] payCash = { 0, 0, 0, 0, 0, 0, 0 };
		int[] usdBills = { 100, 50, 20, 10, 5, 2, 1 };

		System.out.println("Denomination:" + "\t Number of bills:");

		for (int i = 0; i < usdBills.length; i++) {
			while (copyCost >= usdBills[i]) {
				payCash[i] += 1;
				copyCost = copyCost - usdBills[i];
			}
		}
		for (int i = 0; i < usdBills.length; i++) {
			System.out.println(usdBills[i] + "\t\t " + payCash[i]);
		}
	}

	public static void main(String[] args) {
		
		numberOfBills(781);
		
	}

}
