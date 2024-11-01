package classes.abstract_classes_and_interfaces;

public class TestDrive {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setTypeEat("fish");
        System.out.println(cat.getTypeEat());
    }
}
