package classes.anonimClass;

public class UnknownClassTest {
    public static void main(String[] args) {
        // Реализаци анонимного класса по интерфейсу
        AbleToEat someObject = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Animal is eating...");
                someMethod();
            }

            private void someMethod() {
                System.out.println("Новый приватный метод");
            }

            // Бесполезный метод
            public void setName(String name) {
                System.out.println(name);
            }
        };

        someObject.eat();
        //someObject.setName("Karl"); // Выдаст ошибку так как надо сделать down casting, но так как он анонимный у нас получится это сделать
        System.out.println();

        // Реализация анонимного класса, который наследуется от родителя

        Animal animal = new Animal("Собака") {

            @Override
            public void sayHello() {
                System.out.print("Привет! ");
            }
        };

        animal.sayHello();
        System.out.println(animal.getType());

    }
}

// Пример с интерфейсом
interface AbleToEat {
    public void eat();
}


// Пример с классом
class Animal {
    private final String TYPE;

    Animal(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        return TYPE;
    }

    public void sayHello() {
        System.out.println("Hello, I am ");
    }
}
