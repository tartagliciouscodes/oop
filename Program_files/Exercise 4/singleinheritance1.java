class BankAccount
{
float balance;


void deposit(float amount)
{
balance+=amount;
System.out.println("balance:"+balance);
}

void withdraw(float amount)
{
balance-=amount;
System.out.println("balance:"+balance);
}
}

class Interest extends BankAccount
{
float interest;

void interest()
{
interest=balance/100;
System.out.println("interest:"+interest);
}
}
class singleinheritance1 {
public static void main(String args[])
{
Interest obj= new Interest();
obj.deposit(1000);
obj.withdraw(100);
obj.interest();
}
}