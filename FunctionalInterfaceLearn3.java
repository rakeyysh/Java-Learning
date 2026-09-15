import java.util.*;
import java.util.function.*;

public class FunctionalInterfaceLearn3 {


public static void main(String[] args) {

    Function<Integer,Integer>add = (a)->a+10;

    System.out.println(add.apply(4));


    Function<Integer,Integer>multiply = (b) ->b*10;
    System.out.println(multiply.apply(5));


    System.out.println(add.andThen(multiply).apply(9));   // g(f(x)). always calcultae from LEFT --> RIGHT


    System.out.println(add.compose(multiply).apply(9));  // f(g(x)) .. compose always do from RIGHT --> LEFT


    
}
    
}
