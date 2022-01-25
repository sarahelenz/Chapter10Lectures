public class ArrayAlgorithms {
    public static void main(String[] args) {
        int[] array = createRandomArray();
        printArray(array);
        System.out.println(amountOverTen(array));
    }
    public static int amountOverTen(int[] x){
        int count = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] > 10){
                count += 1;
            }
        }
        return count;
    }

    public static int findMax(int[] x){
       int startingValue = 0;

        for(int i = 0; i < x.length; i++) {
           int currentValue = x[i];
        }
    }

    public static int[] createRandomArray(){
        int array[] = new int[10];
        for(int x = 0; x < array.length; x++){
            array[x] = (int)(Math.random() * 100) + 1;
        }
        return array;
    }

    public static void printArray(int[] x){
        System.out.print("{");

        for(int y = 0; y < x.length; y++){
            System.out.print(" " + x[y]);
            if(y < x.length - 1){
                System.out.print(" |");
            }

        }
        System.out.println(" }");
    }
}
