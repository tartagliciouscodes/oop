class exphan4 {
static void intage(int age) {
if (age<0) {
throw new ArithmeticException("invalid age");
}
else {
System.out.println("age:"+age);
}
}

public static void main(String[] args) {
exphan4 obj= new exphan4();
obj.intage(-9);
}
}