// 1. Thread class
// 2. By implementing Runnable interface
// class Book extends Thread{
//     void updateDate() {
//         for (int i=0; i<5; i++){
//         System.out.println("UpdateData called");
//         try {
//             Thread.sleep(5000);
//         } catch (InterruptedException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//         }
//     }
// }
// class User {
//     void display() {
//         for (int i=0;i<5; i++){
//         System.out.println("display method called");
//         }
//     }
// }

// public class thread_exm {
//     public static void main(String[] args) {
//         Book b = new Book();
//         User u = new User();
//         b.updateDate();
//         u.display();
//     }
// }
// -------------------------------------------------------
// We cannot use multiple methods in thread
class Book extends Thread{
    public void run() {
        for (int i=0; i<5; i++){
        System.out.println("UpdateData called");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
}
class User extends Thread {
    public void run() {
        for (int i=0;i<5; i++){
        System.out.println("display method called");
        }
    }
}
public class thread_exm {
    public static void main(String[] args) {
        Book b = new Book();
        User u = new User();
        b.start();
        u.start();
    }
}