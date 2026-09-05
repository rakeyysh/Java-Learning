public class Anonymous {

    public static void main(StringExample[] args) {

        Person p = new Person();
        p.greet();

        // Person a = new Boy();
        // a.greet();

        // anonymous class. --> replace by Lambdas after Java updates

        // Anonymous Class does have Constructor as It does not have class name.

        Person b = new Person() {
            @Override
            void greet() {
                bye();
                System.out.println("Hello I m a Boy!!");
            }

            void bye() {
                System.out.println("Bye - Bye 2025!!");
            }
        };

        b.greet();
        // b.bye(); // it gives error you can create a new method inside the anonymous
        // class but only call inside the override method (greet());

    }
}

class Person {

    void greet() {
        System.out.println("Hello I m a Person");
    }

}

class Boy extends Person {

    @Override
    void greet() {
        System.out.println("Hi I m a Boy!!");
    }
}
