import java.util.ArrayList;
import java.util.List;

public class WildCardGenerics2 {

    public static void main(String[] args) {

        // Animal p = new Dog();
        // p.eat();
        // p.walk();

        List<Dog> dogs = new ArrayList<>();
        // List<Animal>animals = dogs; // not allowed thats why generics breaks the
        // parent child relationship
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        // fun(dogs);

        List<Animal> animals = new ArrayList<>();
        List<Integer>numbers = new ArrayList<>();

        // numbers.add(Integer.valueOf(5));
        // fun(numbers);

        // animals.add(new Animal());
        // animals.add(new Animal());

        // fun(animals);

    }

    // static void fun(List<Animal>animals){

    // for(Animal animal : animals){
    // animal.eat();
    // }
    // }
    // values.add(new Dog());  wrong

    // static void fun(List<?> values) {

    //     for (Object obj : values) {
    //         System.out.println(obj.getClass()); // You can only read using object not modify because you
    //                                                       // cannot know the type until runtime
    //     }
        
    //}
}

class Animal {

    void walk() {
        System.out.println("Walking");
    }

    void eat() {
        System.out.println("Eating");
    }

}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}
