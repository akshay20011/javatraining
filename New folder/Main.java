class Animal{
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Derived class 2
class Labrador extends Dog {
    void color() {
        System.out.println("The Labrador is usually yellow or chocolate in color.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Labrador myLabrador = new Labrador();
        myLabrador.eat();   // Inherited from Animal
        myLabrador.bark();  // Inherited from Dog
        myLabrador.color(); // Specific to Labrador
    }
}
