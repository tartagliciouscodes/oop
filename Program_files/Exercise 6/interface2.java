interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }

    public void stop() {
        System.out.println("Car stops with brake");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with kick");
    }

    public void stop() {
        System.out.println("Bike stops with disc brake");
    }
}

class interface2 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();

        Vehicle v2 = new Bike();
        v2.start();
        v2.stop();
    }
}
