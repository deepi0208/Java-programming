//To create Class
class car{
    String color;
}
class bike {
    String color;
}
public class createClass {
    public static void main(String[] args) {
        car c = new car();
        c.color = "red";
        System.out.println(c.color);

        bike b = new bike();
        b.color = "blue";
        System.out.println(b.color);
    }
}