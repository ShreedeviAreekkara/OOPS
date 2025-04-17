package Inheritance.problem6;

public class Main {
    public static void main(String[] args) {
        Person person= new Person("Areekkara","Shreedevi");

        System.out.println(person.getFirstName());

        System.out.println(person.getLastName());

        Employee employee = new Employee("Seenivasa","Kiran","Kir123","Ortho Surgeon");

        System.out.println(employee.getEmployeeId());

        System.out.println(employee.getLastName());


    }
}
