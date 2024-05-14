// in 'this' keyword-instance variable name and passing argument's name are must be same name.
class student {
   //Instance variables
    int roll;
    String name;
    int age;
    String course;

    void setData(int roll, String name, int age, String course) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    void show() {
        System.out.println("RollNo: "+ roll +" Name: "+ name +" Age: "+ age + " Course: "+ course);
        // display(); and this.display(); - both are same meaning. We can use any one of this.
        display();  
        this.display();  
    }
    void display() {
        System.out.println("display method called");
    }
}
public class this_keyword {
    public static void main(String[] args) {
        
        student s = new student();
        s.setData(1,"sam",20,"Java");
        s.show();
    }
}
