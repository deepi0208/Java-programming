import java.util.Scanner;
public class days {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    // Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name
    System.out.print("Enter the day: ");
    int day=scan.nextInt();
    switch(day){
        case 1:
        System.out.println("Sunday");
        break;
        case 2:
        System.out.println("Monday");
        break;
        case 3:
        System.out.println("Tuesday");
        break;
        case 4:
        System.out.println("Wednesday");
        break;
        case 5:
        System.out.println("Thursday");
        break;
        case 6:
        System.out.println("Friday");
        break;
        case 7:
        System.out.println("Saturday");
        break;
    }
    scan.close();
    }    
}

