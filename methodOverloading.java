//If a class has multiple methods having same name but different in

//Void display();
//Void display(int a, int b);
//Void display(int a, float b, int c);
//float display(float a,float b);

// method name same
// different datatype

class calculator {
    int add (int a, int b){
        return a+b;
    }
    int add (int a, int b, int c) {
        return a+b+c;
    }
    float add (int a, float b, int c) {
        return a+b+c;
    }
    float add (float a, float b) {
        return a+b;
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
        System.out.println(c.add(10,2.5f,20));
        System.out.println(c.add(5.5f,10.5f));
    }    
}
