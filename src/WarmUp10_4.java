/* Create a Two-Dimensional array of int[2][3] and
 * place any numbers you want into each element.
 * Write a method that will print the array in the
 * form:
 *        [ 1, 2, 3 ]
 *        [ 4, 5, 6 ]
 *
 * Then write a method that will total the array
 * return the total. Finally, write a method
 * that will find if any values are repeated in
 * the array. If they are, return true. If no
 * values are repeated, return false.
 */

public class WarmUp10_4 {
	public static void main(String[] args) {
		int[][] array = {{1,2,3},{4,5,6}};
		printArray(array);
		System.out.println(totalArray(array));
		System.out.println(ifRepeat(array));
	}
	public static void printArray(int[][] a){

		for(int x = 0; x < a.length; x++){
			System.out.print("[ ");
			for(int i = 0; i <= a.length; i++){
				System.out.print( a[x][i]);
				if(i < a.length){
					System.out.print(", ");
				}
			}
			System.out.println(" ]");
		}
	}
	public static int totalArray(int[][] a){
		int sum = 0;
		for(int x = 0; x < a.length; x++){
			for(int i = 0; i <= a.length; i++){
				sum += a[x][i];
			}
		}
		return sum;
	}
	public static boolean ifRepeat(int[][] a){
		for(int x = 0; x < a.length; x++){
			for(int i = x+1; i < a.length; i++){
				if(a[x] == a[i]){
					return true;
				}
			}
		}
		return false;
	}
}
