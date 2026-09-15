import java.util.*;

public class Comparable_learn {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(28, "Rakesh"));
        list.add(new Student(12, "Gilbert"));
        list.add(new Student(41, "John"));
        list.add(new Student(30, "Anuj"));
        list.add(new Student(30, "Aatman"));

        Collections.sort(list);

        for (Student curr : list) {
            System.out.println(curr.name + " " + curr.age);

        }
    }
}

class Student implements Comparable<Student> {

    int age;
    String name;

    Student(int age, String name) {

        this.age = age;
        this.name = name;

    }

    @Override
    public int compareTo(Student Second) {
        return this.name.compareTo(Second.name); // string
    }

}