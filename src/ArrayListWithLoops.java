import java.util.ArrayList;

public class ArrayListWithLoops {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 3, 1, 5};
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
        System.out.println(ifAnyEven(arrayList));
    }
    public static String ifAnyEven(ArrayList<Integer> a){
        for(int x = 0; x < a.size(); x++){
            if(a.get(x) % 2 == 0){
                return "Even";
            }
        }
        return "Odd";
    }
}
