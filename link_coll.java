import java.util.LinkedList;

public class link_coll {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        System.out.println(list);
        //addFirst and addLast method
        list.addFirst(100);
        list.addLast(200);
        System.out.println(list);

        list.add(1,500);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList();

        list1.add(2000);
        list1.add(5000);
        //addAll method
        list1.addAll(list);
        System.out.println("addAll method =>"+list1);
        //removeAll method
        list1.removeAll(list1);
        System.out.println("removed list =>"+list);
    }
    
}
