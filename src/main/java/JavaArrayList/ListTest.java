package JavaArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

//        List (Duplicate value supported)
        stringList.add("Rifat");
        stringList.add("Raka");
        stringList.add("Rokib");
        stringList.add("Rakib");
        stringList.add("Rimon");
        stringList.add("Rumman");
        stringList.add("Robin");
        stringList.add("Robin");
        stringList.add(null);

        stringList.remove(2);

        stringList.add(1, "Salman");

//        searching
        System.out.println("Searched: " +stringList.get(5));

        for (String string: stringList){
            System.out.println(string);
        }
    }
}
