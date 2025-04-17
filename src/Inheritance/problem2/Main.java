package Inheritance.problem2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Vehicle car1 = new Car();

        vehicle.drive(); //This will call the drive() method in Vehicle class
        car.drive(); //This will call the drive() metjod in Car class
        // in the below case the reference type is Vehicle class and since Vehicle class has drive() method,
        // the method can be accessed but the drive() method from Car class will be accessed
        car1.drive();
    }
}
