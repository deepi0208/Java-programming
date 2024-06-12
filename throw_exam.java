// THROW EXAMPLE

import java.util.Scanner;

class invalidAgeException extends Exception {
    invalidAgeException() {
        System.out.println("Not Eligible");
    }
}
public class throw_exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scan.nextInt(); 
        
        if(age<18) {
            try {
                throw new invalidAgeException();
            } catch (invalidAgeException e){
                System.out.println(e);
            }
        }
        else {
            System.out.println("Eligble for voting");
        }
    }
    
}
