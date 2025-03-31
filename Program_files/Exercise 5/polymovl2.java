class Display {

    void show(int x) {
        System.out.println("x: " + x);
    }


    void show(String x) {
        System.out.println("x: " + x);
    }


    void show(double x) {
        System.out.println("x: " + x);
    }
}

class polymovl2 {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(100);         
        obj.show("Hello");     
        obj.show(25.75);       
    }
}
