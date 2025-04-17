package Inheritance.problem1;

public class p1 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();

        //here Animal reference determines if the method could be accessed while the Cat class determines the method that needs to be called
    }
}
