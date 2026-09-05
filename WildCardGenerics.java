import java.util.ArrayList;
import java.util.List;

public class WildCardGenerics {
    

    public static void main(String[] args) {

        Animal p = new Dog();
        p.eat();
        p.walk();

        List<Dog>dogs = new ArrayList<>();
       // List<Animal>animals = dogs;           // not allowed thats why generics breaks the parent child relationship
       
        


    }
}

class Animal{

  
    void walk(){
        System.out.println("Walking");
    }

    void eat(){
        System.out.println("Eating");
    }


}

class Dog extends Animal{


    void bark(){
        System.out.println("Barking");
    }
}
