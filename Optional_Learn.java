import java.util.*;
public class Optional_Learn {

    public static void main(String[] args) {
        Optional<String>name = Optional.of("Rakesh"); // explicitly requires a non null value --> Optional.of();

        System.out.println(name.orElse("FORD"));


    //  name.ifPresent((x)->System.out.println("Hi"));  // run this when value is not NULL

    // System.out.println(name.orElse("BHAGO"));
    // Optional<String>school = Optional.ofNullable(null);
    // school.ifPresent((a)->System.out.println(a));

    //System.out.println(school.orElse("TATA"));

   // System.out.println(school.orElseGet(()->"Hyundai"));// it does not check else if name is present unlike orElse

    // System.out.println(school.orElseThrow());  // throws an exception if value not present







    }
    
}
