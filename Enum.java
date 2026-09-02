public class Enum {

    public static void main(String[] args) {
        OrderStatus x = OrderStatus.SHIPPED;
        OrderStatus y = OrderStatus.CONFIRMED;

        // System.out.println(x);
        // System.out.println(x.getA());
        // System.out.println(y.getA());

        OrderStatus[] arr = OrderStatus.values();
        for (OrderStatus it : arr) {
            System.out.println(it); // in Enum (OrderStatus class);
            System.out.println(it.name()); // in string;
        }
        System.out.println(arr.length);

        OrderStatus p = OrderStatus.valueOf("SHIPPED");
        System.out.println(arr.length);

    }

}

// values --> gives all the enum Objects in array
// valueOf --> convert a string into an enum Objects;
// .name() --> gives enum objects in strings cannot Overriden
// .toString() --> gives enum objects in strings can be overidden
enum OrderStatus {

    SHIPPED(1),
    PENDING(2),
    CONFIRMED(3);

    private int a;

    private OrderStatus(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }

}
