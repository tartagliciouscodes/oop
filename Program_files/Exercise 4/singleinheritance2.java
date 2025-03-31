class student {
int rollno;
String name;

student(String name, int rollno) {
this.name=name;
this.rollno=rollno;
}
void displayStudentDetails() {

System.out.println("name:"+name);
System.out.println("rollno:"+rollno);
}
}

class exam extends student {
int marks;

exam(String name, int rollno, int marks){
super(name,rollno);
this.marks=marks;
}
void displayExamDetails() {
displayStudentDetails();
System.out.println("marks:"+marks);

}
}
class singleinheritance2 {
public static void main(String[] args) {

exam student1 = new exam("su", 101, 23);
student1.displayExamDetails();

exam student2 = new exam("ru", 102, 24);
student2.displayExamDetails();
}
}