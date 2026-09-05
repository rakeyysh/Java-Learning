public class Abstraction {

    public static void main(StringExample[] args) {
        
        // Very Similar to the concept of pure virtual function in cpp.

        // This Gives error in compile time as you cannot create an object with the abstract class.
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

abstract class Car {

    abstract public void start();

    abstract public void accelarate();

    public void brake() {
        System.out.println("Applying Brake");
    }
}

class FuelCar extends Car {

    @Override
    public void start() {
        System.out.println("Fuel Car is Starting");
    }

    @Override
    public void accelarate() {
        System.out.println("Fuel car is accelarting");
    }

}

class ElectricCar extends Car {

    @Override
    public void start() {
        System.out.println("Electric Car Car is Starting");
    }

    @Override
    public void accelarate() {
        System.out.println("Electric car is accelarting");
    }
}
