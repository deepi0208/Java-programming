public class methods {
    public static void main(String[] args) {
        // add();     
        // add(5,10);
        // methods m = new methods();
        // m.welcome();
        methods s = new methods();
        s.show();
    }
    //no argument passed & no return value
    //1) static to static method:
    // static void add() {
    //     int a=10,b=20;
    //     int c=a+b;
    //     System.out.println("a+b= "+c);
    // }

    //argument passed
    // static void add(int a,int b) {
    //     int c=a+b;
    //     System.out.println("a+b= "+c);
    // }

    //2) static to non-static:
    //  void welcome(){
    //     System.out.println("welcome method called");
    //  }

     //3) non-static to non-static
    //  void show() {
    //     System.out.println("show method is called");
    //  }
    //  void welcome() {
    //     System.out.println("welcome method is called");
    //     show();
    //  }

    //non-static to static
    void show() {
        System.out.println("show method is called");
        welcome();
    }
    static void welcome() {
        System.out.println("welcome method is called");
    }
}
