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
