package advanced;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++){

            arrayList.add(i);
        }

        System.out.println(arrayList.toString());
    }
}
