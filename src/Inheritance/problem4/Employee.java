package Inheritance.problem4;
//4. Write a Java program to create a class called Employee with methods called work() and getSalary().
//Create a subclass called HRManager that overrides the work() method and add a new method called addEmployee().

public class Employee {

    private float salary;
    Employee(float salary){
        this.salary=salary;
    }
    public void work(){
        System.out.println("Works as an Employee");
    }
    public float getSalary(){
     return salary;
    }
}

class HRManager extends Employee{

    HRManager(float salary){
        super(salary);
    }
    @Override
    public void work(){
        System.out.println("Recruites new employees");
    }

    public void addEmployee(){
        System.out.println("Add a new employee to the organisation");
    }
}
