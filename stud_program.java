//TASK
// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class student {
    String name;
    int roll_no;
}
public class stud_program {
    public static void main(String[] args) {
        student s = new student();
        s.name = "John";
        System.out.println("Student name: "+ s.name);
        s.roll_no = 2;
        System.out.println("Student roll no: "+ s.roll_no);
    }    
}
