//By using Runnable
//obj creation-types in threads - thread(), thread(string name), thread(runnable r), thread(runnable)
class demo {
    void demoMethod() {
        System.out.println("demo method called");
    }
}
interface demo1 {
    void hello();
}
class Book extends demo implements Runnable{
    public void run() {
        for (int i=0; i<5; i++){
        System.out.println("CurrentThread1 "+Thread.currentThread().getName());
        System.out.println("UpdateData called");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}

public class thread_exm1 {
    public static void main(String[] args) {
        Book b = new Book();
        // Thread t = new Thread(b);
        Thread t = new Thread(b, "Thread_Hello");
        t.start();
        b.demoMethod();  
        // b.hello(); 
    }    
}
