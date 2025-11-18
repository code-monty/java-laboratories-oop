package Laboratories;

public class Employee {
    private int EmployeeId;
    private String department;
    private String firstName;
    private String lastName;

    Employee (int EmployeeId, String department, String firstName, String lastName) {
        this.EmployeeId = EmployeeId;
        this.department = department;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayEmployeeDetail() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Employee Id:  " + this.EmployeeId);
        System.out.println("Department: " + this.department);
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public int computeSalary() {
        return 0;
    }
}
