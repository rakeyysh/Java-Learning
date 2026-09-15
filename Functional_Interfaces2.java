import java.util.*;
import java.util.function.*;
public class Functional_Interfaces2 {

    public static void main(String[] args) {
        
        Function<Integer,Integer>square = (a)-> a*a;

        System.out.println(square.apply(5));

        
        Consumer<String>print = (t)-> System.out.println("Hi "+t);

         String name  = "Rakesh";
         print.accept(name);


         Supplier<Integer>randomValue = ()->100;

         System.out.println(randomValue.get());


         Predicate<String>isYou = (x)-> x.equals("Rakesh");

         System.out.println(isYou.test("Rakesh"));
         System.out.println(isYou.test("Deepak"));

            
     
    }
    
}
