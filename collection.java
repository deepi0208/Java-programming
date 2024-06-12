import java.util.ArrayList;
import java.util.Iterator;
public class collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(); //declaration
        
        list.add(100);
        list.add(100);
        list.add(200);
        list.add(5);

        list.add(2, 500); //add values using index value
        for (int i=0;i<5;i++) {
            list.add(i);
        }
        System.out.println("Before =====>" +list);
        list.remove(5);
        System.out.println("After =====>" +list);

        //ArrayList for String
        ArrayList<String> slist = new ArrayList<>();
        slist.add("hello");
        slist.add("demo");
        System.out.println(slist);

        ArrayList alist = new ArrayList<>();
        alist.add(1);
        alist.add("demooo");
        System.out.println(alist);

        // iterable:- to print without array
        //hasNext()-it returns boolean value.
        //next()-
        //remove-it remove values from last
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //for each
        for (String i : slist) {
            System.out.println(i);
        }   
    }  
}
