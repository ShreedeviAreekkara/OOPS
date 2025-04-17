package Inheritance.problem4;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(30000);
        HRManager manager = new HRManager(70000);

        emp.work();

        System.out.println(emp.getSalary());

        manager.work();

        System.out.println(manager.getSalary());

        manager.addEmployee();
    }
}
