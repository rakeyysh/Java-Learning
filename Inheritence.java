public class Inheritence {

    public static void main(String[] args) {

        // parent Class object

        EngineeringStudent A = new EngineeringStudent("Basic Mechanical Engineering"); // Child class object

       

        // A.attendLab();
        // A.attendClass();

        // Student B = new Student();
        // B.name = "Raju";
        // B.attendClass();

        A.attendLab();

    }

}

class Student {

    public String name;
    public int age;
    public int height;
    public int weight;

    Student(String name, int age, int height, int weight) {

        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public void attendClass() {

        System.out.println(this.name + " attended the class today");
    }

}

class EngineeringStudent extends Student {

    public String name;

    public String branch;

    EngineeringStudent(String branch) {
        super("Rakesh", 28, 170, 72);
        this.branch = branch;
    }

    public void attendLab() {

        System.out.println("name " + super.name + " age " + this.age + " height " + this.height + " weight "
                + this.weight + " branch " + this.branch);
        System.out.println(super.name + " attended the lab today of " + this.branch);
    }

}