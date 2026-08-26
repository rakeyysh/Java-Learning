public class static_keyword {

    public static void main(String[] args) {

        Human X = new Human();
        X.display();
        Human Y = new Human();

        Y.display();
        System.out.println(Human.count);

    }

};

class Human {

    int age;
    int height;
    int weight;
    static String country = "india";
    static int count = 0;

    Human() {
        this.age = 29;
        this.height = 170;
        this.weight = 67;

        count++;

    }

    // runs once when class is initialized and JVM inilizes class before any object
    static {
        System.out.println("Print evrytime");
    }

    void display() {
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("country: " + country);

        System.out.println("Total: " + count);
    }

}
