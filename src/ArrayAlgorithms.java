public class ArrayAlgorithms {
    public static void main(String[] args) {
        int[] array = createRandomArray();
        sortArray(array);
        printArray(array);

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
       int index = 0;
        int max = x[index];
        for(int i = 0; i < x.length; i++) {
            if(max < x[i]){
                max = x[i];
            }
        }
        return max;
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

    public static void sortArray(int[] array){
        int temp;
        for(int x = 0; x < array.length; x++){
            for (int y = 0; y < array.length - 1; y++){
                if(array[y] > array[y + 1]) {
                    temp = array[y + 1];
                    array[y + 1] = array[y];
                    array[y] = temp;
                }
            }
        }
    }
}
