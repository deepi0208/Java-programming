class calculator{
    int mul(int a, int b) {
        return a*b;
    }
    int mul(int a, int b, int c) {
        return a*b*c;
    }
    float mul(int a, float b, int c) {
        return a*b*c;
    }
    float mul(float a, float b) {
        return a*b;
    }
}
public class constructor1 {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.mul(1,2));
        System.out.println(c.mul(2, 2, 2));
        System.out.println(c.mul(2, 1.2f, 2));
        System.out.println(c.mul(1.5f, 1.5f));
    }
    
}
