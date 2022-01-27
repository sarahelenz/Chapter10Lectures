import java.util.ArrayList;

public class ArrayListDeclareInit {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println(arrayList);
        arrayList.add(5);
        System.out.println(arrayList);
        arrayList.add(0, 7);
        System.out.println(arrayList);
    }
}
