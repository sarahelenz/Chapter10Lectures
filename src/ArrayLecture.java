public class ArrayLecture {
    public static void main(String[] args) {
        int array[] = new int[5];
        System.out.println(array[0]);
        String[] array2 = new String[5]; //put the brackets with the data type to make multiple variables of the array
        System.out.println(array[2]);
        array2[1] = "hello";

        int array3[] = {1,2,3};
        //Creates a new array and the other array won't be able to be accessed
        array = new int[10];

     // Can't do:   array = {1,2,3}; since it was already created
    }
}
