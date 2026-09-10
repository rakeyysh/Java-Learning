import java.util.*;

public class List_learn {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // Methods

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(5);
        list.add(6);
        list.add(7);

        // System.out.println(list.get(3));

        // list.set(2,33);
        // System.out.println(list);

        // list.addAll(4,List.of(8,9,10));
        // System.out.println(list);

        // System.out.println(list.indexOf(56));

        // System.out.println(list.lastIndexOf(7));

        // ListIterator<Integer>it = list.listIterator(5);

        // while(it.hasNext()){
        // System.out.println(it.next());
        // }

        List<Integer> l1 = List.of(21, 22, 23, 24, 25);

        System.out.println(l1); // Immutable

        List<Integer> l2 = List.copyOf(l1);

        l2.add(100);
        System.out.println(l2); // this is also Immutable

    }

}
