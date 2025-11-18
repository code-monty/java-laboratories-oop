package Laboratories;

public class Contractual extends Employee {
    private int hourlyRate;
    private int totalWorkHours;
    private int totalSalary;

    Contractual(int EmployeeId, String department, String firstName, String lastName, int hourlyRate, int totalWorkHours) {
        super(EmployeeId, department, firstName, lastName);
        this.hourlyRate = hourlyRate;
        this.totalWorkHours = totalWorkHours;
    }
 
    @Override
    public void displayEmployeeDetail() {
        super.displayEmployeeDetail();
        System.out.println("Total Work Hours:  " + totalWorkHours);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + computeSalary());
    }
    

    public int computeSalary() {
        if (totalWorkHours > 120) {
            return 24000;
        }
        else {
            totalSalary = totalWorkHours * hourlyRate;
            return totalSalary;
        }
    } 
}
