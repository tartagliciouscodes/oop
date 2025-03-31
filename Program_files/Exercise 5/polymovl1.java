class matho {
int add(int a,int b) {
return a+b;
}

int add(int a,int b,int c) {
return a+b+c;
}

double add(double a,double b) {
return a+b;
}
 
}

class polymovl1 {
public static void main(String[] args) {
matho obj1=new matho();
System.out.println(obj1.add(1, 2));
System.out.println(obj1.add(1, 2, 2));
System.out.println(obj1.add(1.2, 2.4));
}
}