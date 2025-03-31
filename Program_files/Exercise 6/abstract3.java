abstract class Vehicle {
    abstract void start(); 

    void fuelType() { 
        System.out.println("This vehicle uses fuel");
    }
}

class Car extends Vehicle {
    public void start() { 
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {
    public void start() { 
        System.out.println("Bike starts with a kick");
    }
}

class abstract3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.fuelType();

        Vehicle v2 = new Bike();
        v2.start();
        v2.fuelType();
    }
}
