public class constructor {
    int rollno;
    String name;

    constructor(int r, String n) {
        rollno = r;
        name = n;
    }
    public static void main(String[] args) {
        constructor c = new constructor(1,"demo");
        System.out.println("Rollno: "+c.rollno);
        System.out.println("Name: "+c.name);
    }
}
