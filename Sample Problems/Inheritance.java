// Inheritance

import java.util.Scanner;

class Vehicle {

    String brand, model;
    int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("--- Vehicle Details ---");
        System.out.println("Brand: " + this.brand + 
                            " | Model: " + this.model + 
                            " |  Year: " + this.year);
    }
}

class Car extends Vehicle {

    int numberOfDoors;

    Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.numberOfDoors = doors;
    }

    void displayDetails(){
        System.out.println("--- Vehicle Details ---");
        System.out.println("Brand: " + this.brand + 
                            " | Model: " + this.model + 
                            " |  Year: " + this.year + 
                            " | Doors: " + this.numberOfDoors);
    }

}

class Motorcycle extends Vehicle {

    String engineType;

    Motorcycle(String brand, String model, int year, String engine) {
        super(brand, model, year);
        this.engineType = engine;
    }

    void displayDetails() {
        System.out.println("--- Vehicle Details ---");
        System.out.println("Brand: " + this.brand + 
                            " | Model: " + this.model + 
                            " |  Year: " + this.year + 
                            " | Engine: " + this.engineType);
    }
}

public class Inheritance {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String vehicleType;

        while (true) {
            System.out.print("Enter vehicle type: ");
            vehicleType = input.nextLine();
        
            if (vehicleType.equalsIgnoreCase("Car")) {
                System.out.print("Enter brand: ");
                String brandCar = input.nextLine();
                System.out.print("Enter model: ");
                String modelCar = input.nextLine();
                System.out.print("Enter year: ");
                int yearCar = input.nextInt();
                System.out.print("Enter number of doors: ");
                int numberDoors = input.nextInt();
                Car myCar = new Car(brandCar, modelCar, yearCar, numberDoors);
                myCar.displayDetails();
                break;
            }
            else if (vehicleType.equalsIgnoreCase("Motorcycle") || vehicleType.equalsIgnoreCase("Motor")) {
                System.out.print("Enter brand: ");
                String brandMotor = input.nextLine();
                System.out.print("Enter model: ");
                String modelMotor = input.nextLine();
                System.out.print("Enter year: ");
                int yearMotor = input.nextInt();
                input.nextLine();
                System.out.print("Enter engine type: ");
                String engineTypeMotor = input.nextLine();
                Motorcycle myMotor = new Motorcycle(brandMotor, modelMotor, yearMotor, engineTypeMotor);
                myMotor.displayDetails();
                break;
            }
            else {
                System.out.println("Error.");
            }
        }
    }
}

/*

Scanner input = new Scanner(System.in);
String vehicleType;





do {
    System.out.print("Enter vehicle type: ");
    vehicleType = input.nextLine();
    switch (vehicleType) {
        case "Car":
            System.out.print("Enter brand: ");
            String brandCar = input.nextLine();
            System.out.print("Enter model: ");
            String modelCar = input.nextLine();
            System.out.print("Enter year: ");
            int yearCar = input.nextInt();
            System.out.print("Enter number of doors: ");
            int numberDoors = input.nextInt();
            Car myCar = new Car(brandCar, modelCar, yearCar, numberDoors);
            myCar.displayDetails();
            break;
        case "Motorcycle":
            System.out.print("Enter brand: ");
            String brandMotor = input.nextLine();
            System.out.print("Enter model: ");
            String modelMotor = input.nextLine();
            System.out.print("Enter year: ");
            int yearMotor = input.nextInt();
            System.out.print("Enter engine type: ");
            String engineType = input.nextLine();
            Motorcycle myMotor = new Motorcycle(brandMotor, modelMotor, yearMotor, engineType);
            myMotor.displayDetails();
            break;
        default:
            System.out.println("Error.");
    }
} while (vehicleType != "Car" || vehicleType != "Motorcycle");

 */