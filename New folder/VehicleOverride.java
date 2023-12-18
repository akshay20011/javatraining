class Vehicle{
    int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    void displaySpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String brand;

    public Car(int speed, String brand) {
        super(speed);
        this.brand = brand;
    }

    @Override
    void displaySpeed() {
        super.displaySpeed();
        System.out.println("Brand: " + brand);
    }

    void displayDetails() {
        System.out.println("Car Details:");
        displaySpeed();
    }
}

public class Override {
    public static void main(String[] args) {
        Car myCar = new Car(120, "Toyota");
        myCar.displayDetails();
    }
}

