package Laboratories;

public class Regular extends Employee {
    private int monthSalary;

    Regular(int EmployeeId, String department, String firstName, String lastName, int monthSalary) {
        super(EmployeeId, department, firstName, lastName);
        this.monthSalary = monthSalary;
    }

    @Override 
    public void displayEmployeeDetail() {
        super.displayEmployeeDetail();
        System.out.println("Month Salary: " + monthSalary);
    }
}
