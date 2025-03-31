class person {

String name;

void setName(String name)
{
this.name=name;
}

void display()
{
System.out.println("name:"+name);
}
}
class employee extends person {

String job;

void setEmp(String job)
{
this.job=job;
}

void displayEmp()
{
System.out.println("job:"+job);
}

}
class manager extends employee {

String department;
void setMan(String department)
{
this.department=department;
}

void displayMan()
{
display();
displayEmp();
System.out.println("department:"+department);
}

}

class multilevel1
{
public static void main(String[] args) {

manager obj1= new manager();
obj1.setName("su");
obj1.setEmp("data analyst");
obj1.setMan("cse");
obj1.displayMan();

}

}