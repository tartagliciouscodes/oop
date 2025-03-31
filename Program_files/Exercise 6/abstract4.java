abstract class Animal {
    abstract void sound(); 

    void sleep() { 
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    public void sound() { 
        System.out.println("Dog barks");
    }
}

class abstract4 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound(); 
        obj.sleep(); 
    }
}
