public class excep2 {
    public static void main (String[] args) {
        int a[] = new int[10];
        try{
            a[10]=20/0;
        }
        // catch(ArithmeticException e){
        //     System.out.println(e);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println(e);
        // }
                    //  or
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}