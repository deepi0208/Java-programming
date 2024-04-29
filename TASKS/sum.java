import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        // Write a Java program to display n terms of natural numbers and their sum.
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int s=0,n;
        while (num>0) {
            n=num%10;
            s=s+n;
            num=num/10;
        }
        System.out.println("Sum of digits is: "+s);
        scan.close();
    }
    
}
