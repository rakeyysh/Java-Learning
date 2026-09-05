public class Generic2 {

    public static void main(String[] args) {

        

        Box<Integer> a = new Box<>(100);
        Box<String> b = new Box<>("hi");
        Box<Boolean> c = new Box<>(true);

        // DownCasting
        //  Integer res = (String) (a.getValue()); // gives the error in compile times add extra Safety

        // wrong downcasting
        Integer sum = (Integer) (a.getValue()); // ClassCastExaception
        System.out.println(sum + 5);

        System.out.println(a.getValue());
        System.out.println(b.getValue());
        System.out.println(c.getValue());

    }
}

class Box<T> {

    private T value;

    Box(T val) {
        this.value = val;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T val) {
        this.value = val;
    }
}
