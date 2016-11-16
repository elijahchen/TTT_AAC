package f_17;
/*
 * Implement the Bubble Sort Algorithm
 */
public class G_of_17 {
	
	public static char[] bubbleSortThis(char[] ar){
		char[] list = ar;
		boolean changed = true;
		do{
			changed = false; // False until proven true
			for(int i = 1; i < list.length; i++){
				if(list[i] < list[i-1]){
					char c = list[i];
					list[i] = list[i-1];
					list[i-1] = c;
					changed = true;
				}
			}
		} while(changed == true);
		
		for(int i : list){
			System.out.println(i);
		}
		return list;
	}

	public static void main(String[] args) {
		
		char[] numList = {'e', 'f', 1, 3, 7, 30, 6, 9, 8, 4};
		bubbleSortThis(numList);
		
	}

}
