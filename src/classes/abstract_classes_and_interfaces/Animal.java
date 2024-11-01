package classes.abstract_classes_and_interfaces;

abstract class Animal {
    private final String TYPE;
    private boolean hungry;

    Animal(String type) {
        this.TYPE = type;
    }

    public boolean isAnimalHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    abstract public String getTypeEat();

    abstract public void setTypeEat(String typeEat);

}
