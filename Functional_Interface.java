import java.util.*;

public class Functional_Interface {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int x = 10;
        int y = 20;
        Calculator a = new Addition();
        Calculator b = new Multiplication();
        Calculator c = ((first, second) -> first - second); // using lambda

        System.out.println(print(10, 20, c));

    }

    static int print(int s, int t, Calculator a) {

        return a.calculate(s, t);

    }

}

interface Calculator {
    public int calculate(int a, int b);
}

class Addition implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Multiplication implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}

class Subtraction implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}