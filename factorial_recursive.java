public class factorial_recursive {
    //Factorial Program in recursive method
    static int factorial (int n) {
        if(n==1) {
            return 1;
        }
        else{
        int fact = n*factorial(n-1);
        return fact;
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));


        // Normal Factorial Program
    //     int fact=1;
    //     for (int i=1;i<=5;i++) {
    //         fact *=i;
    //     }
    //     System.out.println(fact);
    // }
        
}
}
