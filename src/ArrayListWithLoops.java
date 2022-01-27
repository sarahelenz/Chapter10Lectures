import java.util.ArrayList;

public class ArrayListWithLoops {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int x  = 0; x < array.length; x++){
            arrayList.add(array[x]);
        }

        int total = 0;
        for(int x = 0; x < arrayList.size(); x++){
            total += arrayList.get(x);
        }
        System.out.println(total);
        System.out.println(arrayList);
    }
}
