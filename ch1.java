public class ch1 {

    public static void main(StringExample[] args) {

        // Implicit Conversion
        // byte --> int

        byte a = 10;
        int b;
        b = a;
        System.out.println(b);

        // Caharcters to int char - 16 bit int - 32 bit
        char c = 'A';
        int d = c;
        System.out.println(d);

        // Explicit Conversion

        int x = 300;
        byte z = (byte) x;
        System.out.println(z);

        float f = 15.6f;
        int g = (int) f;
        System.out.println(g);

        // You cannnot cast for bool even using explicit in java
        // boolean bool = false;
        // int yes = (int) bool;

        byte w = 10;
        byte u = 20;

        byte t = (byte) (w + u);

        System.out.println(t);

    }

}
