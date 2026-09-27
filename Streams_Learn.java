import java.util.*;
public class Streams_Learn {

    public static void main(String[] args) {
        
         List<Integer>list = List.of(1,23,11,45,91,11,23);

        list.stream()
            .filter((x)->x>10)
            .map((x)->x*4)
            .sorted()
            .distinct()
            .limit(2)

            .forEach((x)->System.out.println(x));


            //List<List<Integer>>list2 = List.of(List.of(10,20),List.of(30,40));


            // list2.stream()
            //      .flatMap((x)->x.stream())
            //      .map((x)->x*2)
            //      .forEach((x)->System.out.println(x));
                 


    }
    
}
 