package classes.abstract_classes_and_interfaces;

final class Cat extends Animal {
    private static final String TYPE = "Cat";
    private String typeEat;

    Cat() {
        super(TYPE);
    }


    @Override
    public String getTypeEat() {
        try {
            if (typeEat == null) throw new NullPointerException();
        } catch (NullPointerException npe) {
            System.out.println("Нет информации о еде данного животного");
            return null;
        }
        return "Cat is eating a " + typeEat;
    }

    @Override
    public void setTypeEat(String typeEat) {
        this.typeEat = typeEat;
    }
}
