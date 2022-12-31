package java_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericListTest {
    public static void main(String[] args) {

//        List
        List<Integer> integerList = new ArrayList<>();
        integerList.add(14);
        integerList.add(50);
        integerList.add(21);
        integerList.add(188);
        integerList.add(16);

        integerList.remove(2);

        integerList.add(144);

        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }
}
