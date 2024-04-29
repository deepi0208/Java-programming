class methodsample {
    int rollno;
    String name;
    int age;

    void insertData (int r, String n, int a) {
        rollno = r;
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Rollno: " + rollno + " Name: " + name + " Age: " + age);
    }
}
public class method1 {
    public static void main(String[] args) {
        methodsample m = new methodsample();
        m.insertData(1, "deepi", 20);
        m.display();
        m.insertData(2,"madhu",20);
        m.display();
        m.insertData(3,"dharshini",22);
        m.display();
    }
    
}
