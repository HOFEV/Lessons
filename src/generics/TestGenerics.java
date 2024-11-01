package generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
    public static void main(String[] args) {
        // До появления дженериков
        List testList1 =  new ArrayList();

        testList1.add("cat");
        testList1.add("dog");
        testList1.add("frog");


        String animal1 = (String) testList1.get(1); // down casting
        System.out.println(animal1);

        // С дженериками

        List<String> testList2 = new ArrayList<>();
        testList2.add("cat");
        testList2.add("dog");
        testList2.add("frog");

        String animal2 = testList2.get(1);
        System.out.println(animal2);
    }
}
