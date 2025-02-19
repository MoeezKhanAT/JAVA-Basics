// OOP Concepts: Classes and Objects

class Car {
    // Fields
    String color;
    String model;

    // Constructor
    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Method
    void displayDetails() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }
}

public class OOPConcepts {
    public static void main(String[] args) {
        // Creating an object
        Car myCar = new Car("Red", "Tesla Model S");
        // Calling a method
        myCar.displayDetails();
    }
}