//HashSet

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class collection2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(100);
        set.add(100);
        set.add(200);
        set.add(300);
        System.out.println("set => "+set);

        set.remove(300);
        System.out.println("removed set=> "+set);

        HashSet<String> set1 = new HashSet<>();
        set1.add("karthi");
        set1.add("ram");
        set1.add("ajay");
        set1.add("dinesh");
        set1.removeIf(str -> str.contains("ajay"));
        if(set1.contains("sam")) {
            System.out.println("contains");
        }
        else {
            System.out.println("not contain");
        }
        System.out.println(set1);

        Iterator<String> itr = set1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

//LinkedHashSet
        System.out.println("Linked Hashset");
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("kavi");
        set2.add("keerthi");
        set2.add("priya");
        set2.add("madhu");
        set2.removeIf(str -> str.contains("priya"));
        if(set2.contains("kavi")) {
            System.out.println("contains");
        }
        else {
            System.out.println("not contain");
        }
        System.out.println(set2);
    }
}