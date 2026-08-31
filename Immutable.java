public class Immutable {

    public static void main(String[] args) {

        College b = new College("SATI","Vidisha");
        Student a = new Student(30, 181, 81,b);

       

        
       System.out.println(a.getAge());
       System.out.println(a.getHeight());
       System.out.println(a.getWeight());
       System.out.println(a.getCollege().name);

       a.getCollege().name = "DTU";
       // The Change in College Name proves here  Student class is not purely Immutable.
       System.out.println(a.getCollege().name);

        
        
        

        // a.age = 28;
        // a.height = 170;
        // a.weight = 72;
        // a.display();
        // a.setValue(28,170,72);

    }

}

// made this class Immutable by making the primitive varibale to private and
// removing setValue (method);
// Not Purely Immutable
final class Student {

    private final int age;
    private final int height;
    private final int weight;
    private final College college;

    Student(int age, int height, int weight, College college) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.college = college;
    }
    // void setValue(int age,int height,int weight){
    // this.age = age;
    // this.height = height;
    // this.weight = weight;

    // }

    
    int getAge(){
        return this.age;
    }
     int getHeight(){
        return this.height;
    }
     int getWeight(){
        return this.weight;
    }
     College getCollege(){
        return this.college;
    }



    void display() {
        System.out.println("Age: " + age + " height: " + height + " weight: " + weight + " College: " + college.name);

    }

}

// Mutable
class College {

String name;
String Address;

   College(String name, String Address){
    this.name = name;
    this.Address = Address;
   }

   void display(){
    System.out.println("college "+this.name);
   }

   College getValue(){
    return this;
   }

}
