class Student {
    private String name; 

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

class encap1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John");
        System.out.println("Student Name: " + s.getName()); 
    }
}
