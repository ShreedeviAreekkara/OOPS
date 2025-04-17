package Inheritance.problem6;

//6. Write a Java program to create a class known as Person
// with methods called getFirstName() and getLastName().
//Create a subclass called Employee that adds a new method
//named getEmployeeId() and overrides the getLastName()
// method to include the employee's job title.

public class Person {
    private String firstName;
    private String lastName;
    Person(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName=lastName;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}

class Employee extends Person{
    private String jobRole;
    private String employeeId;
    Employee(String firstName,String lastName,String emploeeId,String jobRole){
        super(firstName,lastName);
        this.employeeId=emploeeId;
        this.jobRole=jobRole;
    }

    public String getEmployeeId(){
        return employeeId;
    }
    @Override
    public String getLastName(){
        return super.getLastName()+" , "+jobRole;
    }


}
