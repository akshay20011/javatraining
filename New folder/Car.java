
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
}

