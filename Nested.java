public class Nested {

    public static void main(StringExample[] args) {

        // Outer.fun();

        Outer X = new Outer();
        X.fun();
        // Outer.Inner Y = new Outer.Inner();
        // Y.greet();

        // Outer.Inner.greet();

        Outer obj = new Outer();
        Outer.Inner.greet(obj);

    }
}

class Outer {

    static int x;
    int y;

    void fun() {

        System.out.println("Hi There!!");

    }

    static class Inner {

        static void greet(Outer data) {
            System.out.println("x:" + x);
            System.out.println("y:" + data.y);
            System.out.println("Welcome to Kainchi!!");
        }

    }

}