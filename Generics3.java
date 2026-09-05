public class Generics3 {

    public static void main(String[] args) {
        
        Box<Integer> b = new Box<>();
        b.value = 10;
        b.printDouble();
    }
    
}

// Generics --> T can be anything;
// Bound in Generics
// extends Number --> T can be number or its subtypes

class Box<T extends Number>{
   

    T value;
    public void printDouble(){
        System.out.println(value.doubleValue());
    }


}
