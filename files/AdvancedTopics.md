# Advanced Topics

## Exception Handling

Exception handling in Java is managed via five keywords: `try`, `catch`, `throw`, `throws`, and `finally`.

```java name=ExceptionHandling.java
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } finally {
            System.out.println("The 'try catch' block is finished.");
        }
    }
}
```

## File I/O

Java provides various classes to read and write files.

```java name=FileIOExample.java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOExample {
    public static void main(String[] args) {
        // Write to a file
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, world!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Read from a file
        try {
            File file = new File("example.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

## Collections Framework

The Java Collections Framework provides a set of classes and interfaces to implement various data structures and algorithms.

```java name=CollectionsExample.java
import java.util.ArrayList;

public class CollectionsExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements
        System.out.println(fruits.get(1));

        // Removing elements
        fruits.remove("Banana");

        // Iterating through the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

## Multithreading

Multithreading in Java allows concurrent execution of two or more threads.

```java name=MultithreadingExample.java
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
```