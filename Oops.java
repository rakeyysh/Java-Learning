public class Oops {

    public static void main(String[] args) {

        Student First = new Student(28, 104, "Rakesh");  // Instance variable
        Student Second = new Student();

        First.display();
        Second.display();


    }

}

// Default Values
// Integer -----> 0
// Float --------> 0.0
// Boolean ------> false;
// String -----> null;

class Student {

    int age;
    int rollNum;
    String Name;

    // Default Constructor

    Student() {

    }

    Student(int a, int r, String n) {
        age = a;
        rollNum = r;
        Name = n;

    }

    void display() {

        System.out.println("Name " + Name + " " + "rollNum " + rollNum + " " + "Age " + age);
    }

}
