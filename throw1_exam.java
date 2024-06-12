//THROWS EXAMPLE

import java.util.Scanner;

class expDemo {
    void division(int x, int y) throws ArithmeticException, NullPointerException {
        int result = x/y;
        System.out.println("Answer: "+result);
    }
}
public class throw1_exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 number : ");
        int x = scan.nextInt();
        int y =  scan.nextInt();
        expDemo obj = new expDemo();
        obj.division(x, y);
    }
}
