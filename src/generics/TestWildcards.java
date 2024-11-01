/*
Wildcards:
<?> Принимает любые списки с объектами, Object -> All
<? extends Animal> Принимает все списки, которые наследуются от Animals включительно Animals -> Cat and Dog
<? super Dog> Принимает все объекты, от которых наследуется Dog -> Animals -> Object
 */


package generics;

import java.util.ArrayList;
import java.util.List;

public class TestWildcards {
    public static void main(String[] args) {
        List<Cat> listOfCats = new ArrayList<>();
        listOfCats.add(new Cat("Барсик"));
        listOfCats.add(new Cat("Мурзик"));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog("Роки"));
        listOfDogs.add(new Dog("Мая"));

        printName(listOfCats);
        printName(listOfDogs);
    }

    // <?> Принимает любые списки с объектами, Object -> All

    // <? extends Animal> Принимает все списки, которые наследуются от Animals включительно Animals -> Cat and Dog
    private static void printName(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal.getName());
        }
    }



    // <? super Dog> Принимает все объекты, от которых наследуется Dog -> Animals -> Object
}

abstract class Animal {
    private final String NAME;

    Animal(String name) {
        this.NAME = name;
    }

    @Override
    public String toString() {
        return "Животное: " + NAME;
    }

    abstract public String getName();
}

class Cat extends Animal {
    private final String name;


    Cat(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}