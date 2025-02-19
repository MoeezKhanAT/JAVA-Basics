// OOP Concepts: Polymorphism

class Animal {
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myCat.sound();
        myDog.sound();
    }
}