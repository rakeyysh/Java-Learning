public class Interfaces {

    public static void main(String[] args) {

        // Very Similar to the concept of pure virtual function in cpp.

        // This Gives error in compile time as you cannot create an object with the
        // abstract class.
        // Car A = new Car();

        Car X = new FuelCar();
        Car Y = new ElectricCar();

        X.start();
        X.accelarate();

        Y.start();
        Y.accelarate();

        X.brake();
        Y.brake();

    }

}

// Polymorphism ---> 2 types ---> compile time (achieved by Method Overloading)
// ---> runtime (achieved by Method Overriding);
// during polymorphism we cannot override the primitive(int,float,char,etc)
// variables;
// static and final variables or methods also cannot be overriden in run time
// polymorphism.

interface Car {

    void start();

    void accelarate();

    void brake();

}

class FuelCar implements Car {

    @Override
    public void start() {
        System.out.println("Fuel Car is Starting");
    }

    @Override
    public void accelarate() {
        System.out.println("Fuel car is accelarting");
    }

    @Override
    public void brake() {
        System.out.println("Fuel Car Brake Applied");
    }

}

class ElectricCar implements Car {

    @Override
    public void start() {
        System.out.println("Electric Car Car is Starting");
    }

    @Override
    public void accelarate() {
        System.out.println("Electric car is accelarting");
    }

    @Override
    public void brake() {
        System.out.println("Electric Car brake applied");
    }
}
