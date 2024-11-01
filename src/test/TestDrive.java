package test;

import java.util.Arrays;
import java.util.List;

public class TestDrive {
    public static void main(String[] args) {
        String[] listStrings = {"оса", "пчела", "бабочка"};
        List<String> list = Arrays.asList(listStrings);

        list.remove(2);
        String outputString = list.get(1);

        System.out.println(outputString);
    }
}
