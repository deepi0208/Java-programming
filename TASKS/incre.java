import java.util.Scanner;
public class incre {
    public static void main(String[] args) {
         // Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
         Scanner scan=new Scanner(System.in);
         System.out.print("Enter number1: ");
         int num1=scan.nextInt();
         System.out.print("Enter number2: ");
         int num2=scan.nextInt();
         System.out.print("Enter number3: ");
         int num3=scan.nextInt();
         if(num1<num2 && num2<num3 && num3>num1){
             System.out.println("Increasing");
         }
         else if(num1>num2 && num2>num3 && num3<num1){
             System.out.println("Decreasing");
         }
         else{
             System.out.println("Neither increasing or decreasing order");
         }
         scan.close();
    }
    
}
