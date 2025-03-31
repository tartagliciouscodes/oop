class parent {

parent() {
System.out.println("dis is parent");
}
}

class child extends parent{
child() {
super();
System.out.println("dis is child");
}
}

class poly1 {
public static void main(String[] args) {
child obj1=new child();

}
}