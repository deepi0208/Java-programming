import java.util.Scanner;
public class cube {
    public static void main(String[] args) {
         // Write a Java program to display the cube of the given number up to an integer.
         Scanner scan=new Scanner(System.in);
         System.out.print("Input number of terms: ");
         int n=scan.nextInt();
         for(int i=1;i<=n;i++){
             System.out.println("Number is "+ i +" and cube of "+ i +" is :  "+ (i*i*i));
         }
         scan.close();
    }
    
}
