import java.util.*;

public class Comparator_learn {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(28, "Rakesh", 102));
        list.add(new Student(32, "Anuj", 104));
        list.add(new Student(11, "Albert", 187));
        list.add(new Student(71, "Gilbert", 172));
        list.add(new Student(2, "John", 111));

        Comparator<Student> c1 = new SortByAge();
        Comparator<Student> c2 = new SortByName();
        Comparator<Student> c3 = new SortByRoll();

        Student K = new Student(100, "Walter", 876);
        Student P = new Student(102, "Jesse", 999);

        Comparator<Student>SortByAge = (x,y)->x.rollNo-y.rollNo;

        // Collections.sort(list, (s1, s2) -> s1.age - s2.age); // using lambda

        for (Student student : list) {

            System.out.println("age " + student.age + " name " + student.name + " rollNo " + student.rollNo);
        }

    }

}

class SortByAge implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }

}

class SortByRoll implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollNo - s2.rollNo;
    }
}

class SortByName implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }

}

class Student {

    int age;
    String name;
    int rollNo;

    public Student(int age, String name, int rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

}
