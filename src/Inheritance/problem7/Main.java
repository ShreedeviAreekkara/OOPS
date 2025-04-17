package Inheritance.problem7;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("xyz","Chennai", 100000, "Automation tester");
        Manager manager = new Manager("Sooraj","Chennai", 120000, "Manager");
        Developer developer = new Developer("Shreedevi","Madurai", 150000, "Developer","Java");
        Programmer programmer = new Programmer("Kiran","Madurai", 120000, "Programmer","Python");


        System.out.println(employee.calculateBonus());
        employee.getPerformanceReports();
        employee.getProject();

        System.out.println(manager.calculateBonus());
        manager.getPerformanceReports();
        manager.getProject();

        System.out.println(developer.calculateBonus());
        developer.getPerformanceReports();
        developer.getProject();

        System.out.println(programmer.calculateBonus());
        programmer.getPerformanceReports();
        programmer.getProject();

    }


}
