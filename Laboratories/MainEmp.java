package Laboratories;

public class MainEmp {
    public static void main(String[] args) { 
        Regular reg = new Regular(1010, "CEIT", "Joschellah", "Costante", 50000);
        Contractual cont = new Contractual(1111, "CEIT", "Alexis", "Paqueo", 200, 121);
        
        reg.displayEmployeeDetail();
        System.out.println(" ");
        cont.displayEmployeeDetail();
        
        System.out.println(reg.getEmployeeId());
    }

       

}
