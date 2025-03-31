class employee {
void work()
{
System.out.println("employee works");
}
}

class manager extends employee {
void manages()
{
System.out.println("manager manages");
}
}

class analyst extends employee {
void analyses()
{
System.out.println("analyst analyses");
}
}

class Hierarchical1 {
public static void main(String args[])
{
manager man1= new manager();
man1.work();
man1.manages();

analyst ana2= new analyst();
ana2.work();
ana2.analyses();
}

}