public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] array2D = new int[3][4];
        int[][] array2DSequel = {{1,2}, {3,4,5}};
        int[][] array3 = {{1,2,3}, {4,5,6}};

     //   method(array3[0]);

        array2D[0][0] = 5;

        for(int x = 0; x < array2D.length; x++){
            for (int y = 0; y < array2D[x].length; y++){
                System.out.print(array2D[x][y] + " ");
            }
            System.out.println();
        }
    }
    //method for one row
//    public static int[][] method(int a[]){
//
//    }
}
