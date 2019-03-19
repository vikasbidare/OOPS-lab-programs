public class Employee {
    String name,designation;
    double salary;
}

class Manager extends Employee{
    String department;
    void print(){
        System.out.println("The details of the manager are:");
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Executive extends Manager{
    void show(){
        System.out.println("Executive:");
        print();
    }
}

class main{
    public static void main(String[] args) {
        Executive a = new Executive();
        a.name = "Raj";
        a.designation = "Developer";
        a.department = "Computer Science";
        a.salary = 60000;
        a.show();
    }
}