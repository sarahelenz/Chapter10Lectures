public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] array2D = new int[3][4];
        int[][] array2DSequel = {{1,2}, {3,4,5}};
        int[][] array3 = {{3,2,1}, {4,5,6}};
        printArray(sortArray(array3));
         //   method(array3[0]);

        array2D[0][0] = 5;

        for(int x = 0; x < array2D.length; x++){
            for (int y = 0; y < array2D[x].length; y++){
                System.out.print(array2D[x][y] + " ");
            }
            System.out.println();
        }
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
    public static int[][] sortArray(int[][] a){
        for(int x = 0; x < a.length; x++){
            for(int i = 0; i < a.length - 1; i++){
                if(a[x][i] > a[x][i + 1]){
                    int temp = a[x][i];
                    a[x][i] = a[x][i + 1];
                    a[x][i + 1] = temp;
                }
            }
        }
        return a;
    }
    //method for one row
//    public static int[][] method(int a[]){
//
//    }
}
