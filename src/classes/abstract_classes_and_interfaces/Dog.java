package classes.abstract_classes_and_interfaces;

public final class Dog extends Animal {
    private static String TYPE = "Dog";
    private String typeEat;

    Dog(String type) {
        super(type);
    }

    @Override
    public String getTypeEat() {
       return null;
    }

    @Override
    public void setTypeEat(String typeEat) {
        this.typeEat = typeEat;
    }
}
