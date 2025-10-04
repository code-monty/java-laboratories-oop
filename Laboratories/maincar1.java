package Laboratories;
import java.util.*;
public class maincar1 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean program = true;
        car1 car = new car1("Mitsubishi","Mirage", "Silver", 2025, 0, false);

    car.display();
    
    while (program) {
        System.out.println("[1] Start Engine");
        System.out.println("[2] Stop Engine");
        System.out.println("[3] Refuel");
        System.out.println("[4] Accelerating");
        System.out.println("[5] Exit");
        System.out.print("Enter your choice: ");
            int choice = input.nextInt();
         
        switch (choice) {
            case 1: {
                car.startEngine();
                break;
            }
            case 2: {
                car.stopEngine();
                break;
            }
            case 3: {
                car.refuel(car.liters);
                break;
            }
            case 4: {
                car.accelerating();
                break;
            }
            case 5: {
                program = false;
                System.out.println("Thank for using the program");
            }
        }
        
    }
    }
   
}
