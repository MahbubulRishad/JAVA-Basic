package JavaArrayList;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Long> longSet = new HashSet<>();

        longSet.add(4561l);
        longSet.add(4561l);
        longSet.add(564l);
        longSet.add(254698l);
        longSet.add(68764l);
        longSet.add(63584l);

//        remove
        longSet.remove(254698l);

        longSet.add(68743l);

        for (Long longValue: longSet){
            System.out.println(longValue);
        }
    }
}
