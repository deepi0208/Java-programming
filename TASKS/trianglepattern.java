import java.util.Scanner;
public class trianglepattern {
    public static void main(String[] args) {
    // Write a Java program to display the pattern like a right angle triangle with a number.

    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=scan.nextInt();
    for(int i=1;i<=n;i++){
        for (int j = 1; j <=i; j++) {
            System.out.print(j+"\t");
        }
        System.out.println();
    }
    
    // Write a Java program using the Scanner class that prompts the user to enter the lengths of the sides of a triangle and determines whether the triangle is equilateral, isosceles, or scalene

    int lenght1,lenght2,lenght3;
    System.out.println("Enter lengths of the triangle: ");
    lenght1=scan.nextInt();
    lenght2=scan.nextInt();
    lenght3=scan.nextInt();
    if(lenght1==lenght2 && lenght2==lenght3){
        System.out.println("The triangle is equilateral");
    }
    else if(lenght1==lenght2 || lenght2==lenght3 || lenght1==lenght3){
        System.out.println("The triangle is isosceles");
    }
    else{
        System.out.println("The triangle is scalene");
    }


    scan.close();   
}
}
