class account {
private double balance;

public account(double balance) {
this.balance=balance;
}

public void setbalance(double newbalance) {
if (newbalance>0) {
balance=newbalance;
}
else {
System.out.println("invalid balance");
}
}

double getbalance() {
return balance;
}
}

class encap4 {
public static void main(String[] args) {
account obj=new account(2000);
obj.setbalance(-500);
System.out.println("Balance:"+obj.getbalance());
obj.setbalance(5000);
System.out.println("Updated Balance:"+obj.getbalance());

}
}
