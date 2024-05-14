abstract class ParentClass {
    abstract void sample();     //Abstract Method

    void display() {            //Non-Abstract Method
        System.out.println("Parent class Method is called");
    }
}
class childClass extends ParentClass {
    void sample(){
        System.out.println("Abstract Method is called");
    }         
}
class demo extends ParentClass{
    void sample(){
        System.out.println("demo method iscalled");
    }
}
public class Abstract {
    public static void main(String[] args) {
        ParentClass obj;
        obj = new childClass();
        obj.display();
        obj.sample();
        obj = new demo();
        obj.sample();

    }    
}
