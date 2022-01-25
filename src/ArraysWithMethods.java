public class ArraysWithMethods {
    public static void main(String[] args) {
       // int array[] = new int[2]; array[0] = 5; array[1] = 7;
        int array[] = {5, 7};
        method(array);
    }

    public static void method(int a[]){
        //Changing values of array
        for(int x = 0; x < a.length; x++) {
            a[x] += 2;
        }
        //Printing whole array
        System.out.print("{");

        for(int x = 0; x < a.length; x++){
            System.out.print(" " + a[x]);
            if(x < a.length - 1){
                System.out.print(" |");
            }

        }
        System.out.println(" }");
    }
}
