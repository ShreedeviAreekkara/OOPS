package Inheritance.problem1;
//    1. Write a Java program to create a class called Animal with a method called makeSound().
//    Create a subclass called Cat that overrides the makeSound() method to bark.

public class Animal {
    public void makeSound(){
        System.out.println("Make the animal sound");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("The cat quarrels ");

    }
}


