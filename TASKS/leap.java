import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
    // Write a Java program that takes a year from the user and prints whether it is a leap year or not.

    System.out.print("Enter the Year: ");
    int year=scan.nextInt();
    if (year%4==0){
        System.out.println("Leap year");
    }
    else{
        System.out.println("Not a Leap Year!");
    }
    scan.close();
    }
}
