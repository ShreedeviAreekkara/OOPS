package Introduction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Constructors {
    public static void main(String[] args) {
    //static part      //dynamic part
    Student student01 = new Student();

    // new keyword dynamically allocates memory to the object of the datatype that was created
    //dynamic allocation means the memory is allocated during the runtime
    Student Kichu = new Student("Kiran",26,100);

    // this keyword along with constructor
    // can be used to initialise one object with another object's values
        Student random = new Student(Kichu);

    //this keyword can be used to call a constructor from another contructor
        Student random2 = new Student("contruct");

        System.out.println(student01.rno);
        System.out.println(Kichu.marks);//result of parameterised constructor
        System.out.println(random.name);
        System.out.println(random2.marks);
    }
}
 class Student{
    String name;
    int rno;
    float marks;

//when we have multiple constructors within a single class that is called constructor overloading as,
// constructors are also special functions

Student ()
{
    this.name = "Shreedevi";//this keyword will simply replace the reference variable of the object
    this.marks= 80;
    this.rno = 54;
}

// To understand the importance of this keyword let us have a parameterised constructor
// if we don't use this keyword below the variables will take up default values
// instead of the values sent through argument
Student(String name,int rno,float marks)
{
    this.name = name;
    this.marks= marks;
    this.rno= rno;
}

// this keyword can also be used to initialise one object with another object's values
// this will replace random and other will replace Kiran
Student(Student other) {
    this.name=other.name;
    this.marks=other.marks;
    this.rno = other.rno;
}

//this keyword can be used to call a constructor from another contructor
//the below internally means this keyword will be replaced by the Type Student and
// that constructor(Student(String name,int rno,float marks)) will be called
Student(String random2argument)
{
    this("Shree",16,96.5f);
}

 }