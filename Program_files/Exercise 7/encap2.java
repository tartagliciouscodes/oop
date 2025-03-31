class Employee {
    private int id;
    private String name;
    private double salary;

    public void setId(int newId) {
        id = newId;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class encap2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Alice");
        emp.setSalary(50000);

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
