package Inheritance.problem7;
//7. Write a Java program that creates a class hierarchy for employees of a company.
//The base class should be Employee, with subclasses Manager, Developer, and Programmer.
//Each subclass should have properties such as name, address, salary, and job title.
//Implement methods for calculating bonuses, generating performance reports, and managing projects.


public class Employee {
    private String name;
    private String address;
    private int salary;
    private String jobTitle;
    Employee(String name, String address, int salary, String jobTitle){
        this.name=name;
        this.address= address;
        this.salary = salary;
        this.jobTitle=jobTitle;
    }
    public String getName(){
        return name;
    }
    public String getAddresse(){
        return address;
    }
    public int getSalary(){
        return salary;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public float calculateBonus(){
       return 0.0f;
    }
    public void getPerformanceReports(){
        System.out.println("Performance reports are unavailable");
    }
    public void getProject(){
        System.out.println("This employee has no project details");
    }

}

class Manager extends Employee{
    Manager(String name, String address, int salary, String jobTitle){
        super(name,address,salary,jobTitle);
    }
    public float calculateBonus(){
        return (float) (getSalary()*0.15);
    }
    public void getPerformanceReports(){
        System.out.println("Performance reports of the "+getJobTitle()+" "+getName()+" is : Excellent");
    }
    public void getProject(){
        System.out.println(getJobTitle()+" : "+getName()+" is allocated to Verizon Project");

    }

}

class Developer extends Employee{
    private String programmingLanguage;
    Developer(String name, String address, int salary, String jobTitle,String programmingLanguage){
        super(name,address,salary,jobTitle);
        this.programmingLanguage=programmingLanguage;
    }

    public float calculateBonus(){
        return getSalary()*0.10f;
    }
    public void getPerformanceReports(){
        System.out.println("Performance reports of the "+getJobTitle()+" "+getName()+" is : good");
    }
    public void getProject(){
        System.out.println(getJobTitle()+" : "+getName()+" is allocated to Metro Bank Project and codes in "+programmingLanguage);
    }
    public String getProgramminglanguage(){
        return programmingLanguage;
    }

}

class Programmer extends Developer{
Programmer(String name, String address, int salary, String jobTitle,String programmingLanguage){
    super(name,address,salary,jobTitle,programmingLanguage);
}
    public float calculateBonus(){
        return getSalary()*0.12f;
    }
    public void getPerformanceReports(){
        System.out.println("Performance reports of the "+getJobTitle()+" "+getName()+" is : very good");
    }
    public void getProject(){
        System.out.println(getJobTitle()+" : "+getName()+" is allocated to Metro Bank Project and codes in "+getProgramminglanguage());
    }



}

