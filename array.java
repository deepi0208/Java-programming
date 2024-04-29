//One dimensional array

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] arr = new int[5];
        for (int i=0; i<arr.length;i++){
            System.out.print("Enter a number: ");
            arr[i]=scan.nextInt();
        }
        for (int i=0; i<arr.length;i++){
           System.out.println(arr[i]);
        }
        scan.close();
    }
}
