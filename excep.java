public class excep {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;
        try {
        c=a/b;
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally Block called");
        }
        System.out.println("End of program");
    }
}