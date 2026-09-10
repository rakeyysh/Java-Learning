import java.util.*;

public class Collection_learn {

    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>();

        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        // methods

        // System.out.println(c.size());

        // System.out.println(c.isEmpty());

        // System.out.println(c.contains(1));

        // System.out.println(c.containsAll(c));

        // // boolean add(E e);

        // boolean b = c.add(2);
        // System.out.println(b);

        // // boolean remove(Object o);
        // boolean a = c.remove(3); // removes first 3
        // System.out.println(a);

        // for(Integer i : c){
        // System.out.println(i);
        // }

        // System.out.println(c);

        // // boolean addAll(Collection<? extends E>c)

        // c.addAll(List.of(9,10,11,12));

        // System.out.println(c);

        // // boolean containsAll(Collection<?>c)

        // System.out.println(c.containsAll(List.of(1,2,3)));

        // boolean removeAll(Collection<?>c)

        // System.out.println(c);

        // System.out.println(c.removeAll(List.of(1,21,33)));

        // boolean retainAll(Collection<?>c)

        System.out.println(c.retainAll(List.of(1, 2, 3, 4))); // remove everything except these

        // clear();
        c.clear();

        System.out.println(c);

    }

}
