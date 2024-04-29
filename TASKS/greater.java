import java.util.Scanner;
public class greater{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int number1=scan.nextInt();
        System.out.print("Enter the Number 2: ");
        int number2=scan.nextInt();
        System.out.print("Enter the Number 3: ");
        int number3=scan.nextInt();
        if (number1>number2 && number1>number3){
            System.out.println("Number 1 is greater");
        }
        else if(number2>number1 && number2>number3) {
            System.out.println("Number 2 is greater");
        }
        else {
            System.out.println("Number 3 is greater");
        }
        scan.close();
    }
}
    
