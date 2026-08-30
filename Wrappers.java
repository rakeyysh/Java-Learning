public class Wrappers {

    public static void main(String[] args) {

        int x = 5;
        Integer y = x;

        System.out.println(y); // Autoboxing

        Integer a = 10;
        int b = a;
        System.out.println(b); // Unboxing

        // Integer c = null;
        // int z = c;
        // System.out.println(z); //error : Null Pointer Exception

        // Integer p = 10;
        // Integer q = 20;
        // int sum = p + q;
        // System.out.println(sum);
        // System.out.println(p.intValue() + q.intValue());

        // int w = 0;
        // Integer g = w;
        // System.out.println(g);

        Integer first = 1000;
        Integer second = 1000;

        System.out.println(first == 1000);

        System.out.println(first.intValue() == second.intValue()); // converts Integer to int --> do not use until u
                                                                   // want conversion explicitly

        System.out.println(first.equals(second)); // compare the values

        int f = 100;
        int s = 100;

        System.out.println(Integer.valueOf(f) == Integer.valueOf(s));

    }

}
