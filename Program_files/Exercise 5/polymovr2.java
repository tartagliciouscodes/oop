class animal {
void sound() {
System.out.println("animal makes sound");
}
}

class cat extends animal {
void sound() {
super.sound();
System.out.println("cat meows");

}
}

class polymovr2 {
public static void main(String[] args) {
cat obj=new cat();
obj.sound();
}

}