class name {
String name;

name(String name) {
this.name=name;
}

void displayname() {
System.out.println("name:"+name);
}
}

class school extends name {
String school;

school(String name, String school) {
super(name);
this.school=school;
}

void displayschool() {
displayname();
System.out.println("school:"+school);
}
}

class college extends school {
String college;

college(String name, String school, String college) {
super(name, school);
this.college=college;
}

void displaycollege() {
displayschool();
System.out.println("college:"+college);
}
}

class multilevel2 {
public static void main(String args[])
{
college student1= new college("su","ABC highschool","RI college");
student1.displaycollege();
}
}