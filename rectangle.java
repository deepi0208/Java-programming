//TASK
//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard
class Area {
    int length;
    int breadth;

    void setDim(int l, int b) {
        length=l;
        breadth=b;
    }
    void getArea() {
        System.out.println("Area of triangle: "+ length*breadth);
    }
}
public class rectangle {
    public static void main(String[] args) {
        Area a = new Area();
        a.setDim(4, 3);
        a.getArea();
    }
}