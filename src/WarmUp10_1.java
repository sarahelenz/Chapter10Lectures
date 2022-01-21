/* WarmUp 10_1
 * Create an integer array of size 4, placing any 4 numbers
 * you want into the array. Print out the array so that it
 * looks like [1,5,7,3]. Then increase each element of the 
 * array by 1 and re-print, [2,6,8,4]
 */

public class WarmUp10_1 {

	public static void main(String[] args) {
		int array[] = new int[4];
		array[0] = 1; array[1] = 5; array[2] = 7; array[3] = 3;
//		System.out.println("[" + array[0] + "," + array[1] + "," + array[2] + "," + array[3] + "]");
//		array[0] = array[0] + 1;
//		array[1] = array[1] + 1;
//		array[2] = array[2] + 1;
//		array[3] = array[3] + 1;
		System.out.print("[");
		for(int x = 0; x <= array.length - 1; x++){
			System.out.print(array[x]);
			if(x < array.length - 1){
				System.out.print(",");
			}
		}
		System.out.println("]");

		for(int x = 0; x <= array.length - 1; x++){
			array[x] += 1;
		}

		System.out.print("[");
		for(int x = 0; x <= array.length - 1; x++){
			System.out.print(array[x]);
			if(x < array.length - 1){
				System.out.print(",");
			}
		}
		System.out.print("]");
//		System.out.println("[" + array[0] + "," + array[1] + "," + array[2] + "," + array[3] + "]");

	}

}
