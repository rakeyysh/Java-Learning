public class Functions {

    public static void main(StringExample[] args) {

        int result;
        double res;
        result = add(1, 2);

        // result = add(5,8,10);

        res = add(5.76, 9.97);

        System.out.println("Result is " + result);
        System.out.println("Res is " + res);

    }

    static int add(int a, int b) {

        return a + b;
    }

    static int add(int x, int y, int z) {
        return x + y + z;
    }

    static int add(double p, double q) {
        return (int)(p + q);
    }

    // This Gives Error as it decides from the left side during compile time before
    // execution
    // The return type of the receiving variable cannot be used to select an
    // overloaded method. Overload resolution happens at compile time based
    // primarily on the method invocation and its argument types, before the method
    // executes

    // static double add (int p, int q){
    // return (double)(p+q);
    // }

}
