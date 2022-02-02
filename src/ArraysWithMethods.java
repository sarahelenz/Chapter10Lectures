import javax.swing.*;

public class ArraysWithMethods {
    public static void main(String[] args) {
       // int array[] = new int[2]; array[0] = 5; array[1] = 7;
        int array[] = {5, 7};
        method(array);
        int[] y = createRandomArray();
        printArray(y);
        System.out.println(checkArray(y));
        reverseArray(y);
        printArray(y);

    }

    public static void method(int a[]){
        //Changing values of array
        for(int x = 0; x < a.length; x++) {
            a[x] += 2;
        }
    }
    public static int[] createRandomArray(){
        int array[] = new int[10];
        for(int x = 0; x < array.length; x++){
            array[x] = (int)(Math.random() * 100) + 1;
        }
        return array;
    }
    public static boolean checkArray(int[] i){
      int check = Integer.parseInt(JOptionPane.showInputDialog(null, "What number do you want to check for?"));
        for(int x = 0; x < i.length; x++){
            if(i[x] == check){
                return true;
            }
        }
        return false;
    }

    public static void printArray(int[] x){

        //Printing whole array
        System.out.print("{");

        for(int y = 0; y < x.length; y++){
            System.out.print(" " + x[y]);
            if(y < x.length - 1){
                System.out.print(" |");
            }

        }
        System.out.println(" }");
    }
    public static void reverseArray(int[] a){
        int index = a.length - 1;
        int save = a[index];
        for(int x = 0; x < a.length; x++){
            save = a[x];
            a[index] = a[x];
            index -= 1;

        }
    }
}
