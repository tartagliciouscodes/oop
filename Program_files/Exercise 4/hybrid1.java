interface Vehicle {
    void start();
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
    
    void drive() {
        System.out.println("Car is driving");
    }
}
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }

    void ride() {
        System.out.println("Bike is riding");
    }
}
class HybridCar extends Car{
    void hybridFeature() {
        System.out.println("HybridCar runs on fuel and electricity");
    }
}
class hybrid1 {
    public static void main(String[] args) {
        HybridCar myHybrid = new HybridCar();
        myHybrid.start();        
        myHybrid.drive();        
        myHybrid.hybridFeature();
        
        Bike myBike = new Bike();
        myBike.start(); 
        myBike.ride();  
    }
}