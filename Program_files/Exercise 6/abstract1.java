abstract class bank {
abstract void intr();

void type() {
System.out.println("dis a bank");
}
} 

class sbc extends bank{
public void intr() {
System.out.println("int rate:5%");

}
}

class hdfc extends bank {
public void intr() { 
System.out.println("int rate: 7%");
}
} 

class abstract1 {
public static void main (String[] args) {
sbc obj1=new sbc();
obj1.type();
obj1.intr();

hdfc obj2=new hdfc();
obj2.type();
obj2.intr();

}
}