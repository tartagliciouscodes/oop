class student {
int age;
String name;

student() {
System.out.println("tis is student");

}

student(int age) {
this.age=age;
System.out.println("age:"+age);

}

student(int age, String name) {
this.age=age;
this.name=name;

System.out.println("name:"+name);

}
}

class poly2 {
public static void main (String[] args) {
student obj1= new student();
student obj2= new student(12);
student obj3= new student(12,"su");
}
}