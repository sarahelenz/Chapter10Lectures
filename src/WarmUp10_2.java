/* WarmUp 10_2
 * Create an integer array of size 4, placing any 4 numbers
 * you want into the array. Print out the array so that it
 * looks like { 1 | 5 | 7 | 3 }. Then double each element of the
 * array and re-print, { 2 | 10 | 14 | 6 }
 */

public class WarmUp10_2 {

	public static void main(String[] args) {
		int array[] = {1,5,7,3};

		System.out.print("{");

		for(int x = 0; x < array.length; x++){
			System.out.print(" " + array[x]);
			 if(x < array.length - 1){
				 System.out.print(" |");
			 }

		}
		System.out.println(" }");

		for(int x = 0; x < array.length; x++){
			array[x] *= 2;
		}
		System.out.print("{");

		for(int x = 0; x < array.length; x++){
			System.out.print(" " + array[x]);
			if(x < array.length - 1){
				System.out.print(" |");
			}

		}
		System.out.println(" }");
	}

}
