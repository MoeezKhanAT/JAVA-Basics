// OOP Concepts: Inheritance

// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an object of the derived class
        Dog myDog = new Dog();
        // Calling methods
        myDog.eat();
        myDog.bark();
    }
}