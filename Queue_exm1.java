import java.util.Deque;
import java.util.LinkedList;

public class Queue_exm1 {
    public static void main(String[] args) {
        Deque<String> dq = new LinkedList<>();

        dq.offerFirst("one");
        dq.offerFirst("two");
        dq.offerLast("three");
        dq.offerLast("four");
        dq.offerLast("five");
        System.out.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println("after peek => "+dq);

        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println("after poll => "+dq);
}
    
}
