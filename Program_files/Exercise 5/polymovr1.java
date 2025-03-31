class Parent {
    void show() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the Child class");
    }
}

class polymovr1 {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show(); 
        Child obj2 = new Child();
        obj2.show(); 
        Parent obj3 = new Child();
        obj3.show(); 
    }
}
