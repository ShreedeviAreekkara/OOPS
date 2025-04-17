package Inheritance.problem2;
//    2. Write a Java program to create a class called Vehicle with a method called drive().
//    Create a subclass called Car that overrides the drive() method to print "Repairing a car".

public class Vehicle {

    public void drive() {
        System.out.println("Drive the Vehicle");
    }
}

class Car extends Vehicle{

    @Override
    public void drive() {
        System.out.println("Repair a Car");
    }
}

