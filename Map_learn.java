import java.util.*;

public class Map_learn {

    public static void main(String[] args) {

        Map<Integer, String> mp = new HashMap<>();

        mp.put(101, "Rakesh");
        mp.put(102, "Anuj");
        mp.put(103, "Aditya");
        mp.put(104, "Rohit");

        // System.out.println(mp.size());

        // System.out.println(mp.isEmpty());

        System.out.println(mp.containsValue("Anuja")); // O(n);
        System.out.println(mp.containsKey(102)); // O(1);

        System.out.println(mp.get(101));

        // Map<Integer,String>mp2 = new HashMap<>();
        // mp2.put(1,"Raju");
        // mp2.put(2,"Shyam");

        // mp.putAll(mp2);
        // System.out.println(mp);

        // mp.clear();
        // System.out.println(mp);

        System.out.println(mp.keySet()); // returns key as set

        Collection<String> c = mp.values();

        System.out.println(c);

        // Set<Map.Entry<Integer,String>>mps = mp.entrySet();
        // System.out.println(mps);
        // System.out.println(mp.entrySet());

        // put() -----> Always Replaces
        // putIfAbsent() -----> does not replace Existing values

        System.out.println(mp.getOrDefault(101, "NAHI HAI"));

        System.out.println(mp.putIfAbsent(105, "Walter"));

        mp.remove(101, "Rakesha"); // remove only when both keys and values matches
        System.out.println(mp);

        Set<Map.Entry<Integer, String>> entries = mp.entrySet();
        System.out.println(entries);
        for (Map.Entry<Integer, String> entry : entries) {

            Integer key = entry.getKey();
            String Value = entry.getValue();

            System.out.println("Key " + key + " Value " + Value);

        }

        Map<Integer, String> map1 = Map.of(23, "Hello", 26, "bye");

        // map1.add(28,"Shaadi"); /// we created Immutable Map like List.Of in Lists
        System.out.println(map1);

    }

}
