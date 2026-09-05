public class Generics {

    public static void main(String[] args) {

        // Object obj = 10;

        // String s = (String)obj;
        // System.out.println(s); // thows an ClassCastException

        Box a = new Box(100);
        Box b = new Box("hi");
        Box c = new Box(true);

        // DownCasting
        Integer res = (Integer)(b.getValue());  // not giving any error even after diff datatypes


        // wrong downcasting
        Integer sum =(Integer)(b.getValue()); // ClassCastExaception
        System.out.println(sum + 5);

        System.out.println(a.getValue());
        System.out.println(b.getValue());
        System.out.println((Integer)c.getValue()+6);

    }
}

class Box {

    private Object value;

    Box(Object val) {
        this.value = val;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object val) {
        this.value = val;
    }
}
