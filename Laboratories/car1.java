package Laboratories;
import java.util.Scanner;

public class car1 {
    String brand;
    String model;
    String color;
    int year;
    int fuelLevel;
    int liters;
    boolean isEngineRunning;

    car1(String brand, String model, String color, int year, int liters, boolean isEngineRunning) {
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.year = year;
    this.fuelLevel = liters;
    this.isEngineRunning = isEngineRunning; 
}

    public void display(){
        System.out.println("=== CAR INFORMATION ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color:" + color );
        System.out.println("Year: " + year);
        System.out.println("Fuel Level: " + fuelLevel + " " + "liters" );
    }
    

    public void startEngine() {
        if (fuelLevel > 0) {
            System.out.println("Engine starting.....!");
            isEngineRunning = true;
        }
        else if (isEngineRunning == true) {
            System.out.println("The engine is already started");
        }
        else {
            System.out.println("There is not enough fuel!");
        }
    }

    public void stopEngine() {
        if(isEngineRunning == true) {
            System.out.println("Stopping engine.....");
        }
        else {
            System.out.println("Your Car is not running");
        }
    }
    
    
    public int refuel(int liters) {
        Scanner fuel = new Scanner(System.in);
        System.out.print("Enter the liters you want to refuel: ");
            liters = fuel.nextInt();
            fuelLevel += liters;
            System.out.println("Current fuel level: " + fuelLevel);
            return liters;
    }

    public void accelerating() {
        if (fuelLevel > 5 && isEngineRunning == true) {
            System.out.println("Accelerating.....");
        }
        else if (fuelLevel < 5 && isEngineRunning == true ) {
            System.out.println("Not enough fuel to accelerate!");
        }
    }



}

