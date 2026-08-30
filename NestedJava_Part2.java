public class NestedJava_Part2 {

    public static void main(String[] args) {

        Outer a = new Outer();
        Outer.Inner b = a.new Inner();

        Outer.Inner p = new Outer().new Inner();

        p.greet();

        b.greet();

    }

}

class Outer {

    class Inner {

        void greet() {

            System.out.println("Watch Hanuman Ansh!!");
        }
    }

}