import java.util.ArrayList;
import java.util.List;

public class WildCardGenerics3 {

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

        fun(dogs);

        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);

    }

    // static void fun(List<Animal>animals){

    // for(Animal animal : animals){
    // animal.eat();
    // }
    // }

    static void fun(List<? extends Animal> animals) {

        for (Animal animal : animals) {

            animal.eat();
        }
        // values.add(new Dog()); NO wrong
    }
}

class Animal {

    void walk() {
        System.out.println("Walking");
    }

    void eat() {
        System.out.println(" Animal Eating");
    }

}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dog Eating");
    }

    void bark() {
        System.out.println("Barking");
    }
}
