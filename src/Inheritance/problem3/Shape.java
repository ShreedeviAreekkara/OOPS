package Inheritance.problem3;
//    3. Write a Java program to create a class called Shape with a method called getArea().
//    Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.


import java.util.Scanner;

public class Shape {
public void getArea(){
    System.out.println("The area of the shape ");
}
}

class Rectangle extends Shape{
    @Override
    public void getArea(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length");
        float l = scan.nextFloat();
        System.out.println("Enter the breadth");
        float b = scan.nextFloat();
        System.out.println("The area of the rectangle is : "+l*b );
    }

}
