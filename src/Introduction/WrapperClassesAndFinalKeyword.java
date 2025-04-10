package Introduction;

public class WrapperClassesAndFinalKeyword {
    public static void main(String[] args) {


//when values are stored in primitive datatypes they are stored in the stack memory
// They are not created as objects in heap
        int a = 110;
        final int c = 20;
        //c = 10; ---> this is not permitted as in primitive
        // data types the value will not be allowed to change once assigned

//Inorder to store them as objects they can be stored in Wrapper class
// here also values cannot be swapped as the wrapper class has final keyword in front of it
//public final class Integer extends Number
        Integer b = 110;

//final variables should always be initialised at the time of declaration
// as the values are going to be final else it will throw an error
        //Integer c; ----> this will throw an error as Integer class has final keyword

        System.out.println(b);
// In case of primitiva data types the value will not be allowed to change
//In case of non-primitive data types like where creation of object is involved, value can be changed
//It cannot be reassigned or the place where it points to (as in the reference) cannot be changed.

        final A object = new A();
        object.marks= 89.4f;
        object.marks= 78.9f;
        //the above line is permitted as the value can be changed
        //object = new A("Shree");
        //the above line is not permitted as the reference cannot be reassigned as it is final


    }
}

class A {
    String name;
    float marks;
    A(){
      this.marks= marks;
      this.name = name;
    }
    A(String name){
        this.marks= marks;
        this.name = name;
    }
}