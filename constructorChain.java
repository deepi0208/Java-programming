class student {
    int roll;
    String name;
    int age;
    String course;
    float fees;

    student(int roll, String name, int age, String course) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    student (int roll, String name, int age, String course, float fees) {
        this(roll,name,age,course); //constructor calling must in first line
        this.fees = fees;
    }
    void show() {
        System.out.println("RollNo: "+ roll +" Name: "+ name +" Age: "+ age + " Course: "+ course + " Fees :"+ fees);
     }
}
public class constructorChain {
    public static void main(String[] args) {
        student s = new student(1, "deepi", 20, "java");
        s.show();
        student s1 = new student(2, "madhu", 21, "java", 20000);
        s1.show();
    }
}
