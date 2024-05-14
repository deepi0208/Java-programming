//usage 3.'this()' can be used to invoke the current class constructor
   //To Reuse constructor
   //Constructor chaining
// Two types
   //1. Calling default constructor from parameterized constructor.
   //2. Calling parameterized constructor from default constructor.

   class student {
    //Instance variables
     int roll;
     String name;
     int age;
     String course;

     student() //default constructor
         {
            this(1,"ram",20,"Java"); //calling paremerized constructor
            System.out.println("Default constructor called");
         }
 
     student (int roll, String name, int age, String course) //parameterized constructors 
     {
        //this(); calling default constructor
         this.roll = roll;
         this.name = name;
         this.age = age;
         this.course = course;  
     }
     void show() {
        System.out.println("RollNo: "+ roll +" Name: "+ name +" Age: "+ age + " Course: "+ course);
     }

     }

public class this_key1 {
    public static void main(String[] args) {
        student s = new student();
        s.show();
    }
    
}
