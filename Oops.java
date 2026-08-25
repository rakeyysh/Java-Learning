public class Oops {

    public static void main(String[] args) {

        Student First = new Student();
        First.age = 28;
        First.rollNum = 102;
        First.Name = "Rakesh";

        First.display();

    }

}

class Student {

    int age;
    int rollNum;
    String Name;

    void display() {

        System.out.println("Name " + Name + " " + "rollNum " + rollNum + " " + "Age " + age);
    }

}
