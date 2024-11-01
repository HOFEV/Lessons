package generics;

public class Dog extends Animal {
    private final String name;

    protected Dog(String name) {
        super(name);
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }
}
