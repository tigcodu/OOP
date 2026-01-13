// Abstraction

import java.util.Scanner;

abstract class Employee {

    public abstract void calculateSalary();
    public abstract void displayInfo();

    public void companyPolicy() {
        System.out.print("Company Policy: All employees must submit attendance before payroll processing.");
    }

}

class FullTimeEmployee extends Employee {

    String name;
    double dailyRate;
    int daysWorked;

    FullTimeEmployee(String name, double dailyRate, int daysWorked) {
        this.name = name;
        this.dailyRate = dailyRate;
        this.daysWorked = daysWorked;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary: P" + this.dailyRate * this.daysWorked);
    }

    @Override
    public void displayInfo() {
        
    }
    
}

class PartTimeEmployee extends Employee {

    String name;
    double hourlyRate;
    int hoursWorked;
    
    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary: P" + this.hourlyRate * this.hoursWorked);
    }

    @Override
    public void displayInfo() {
        
    }

}

public class Abstraction {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        String empType;

        while (true) {
            System.out.print("Enter employee type: ");
            empType = input.nextLine();

            if (empType.equalsIgnoreCase("Full-Time")) {
                System.out.print("Enter name: ");
                String empName = input.nextLine();
                System.out.print("Enter daily rate: ");
                double empDailyRate = input.nextDouble();
                input.nextLine();
                System.out.print("Enter days worked: ");
                int empDays = input.nextInt();
                FullTimeEmployee fullTime = new FullTimeEmployee(empName, empDailyRate, empDays);
                fullTime.calculateSalary();
                fullTime.companyPolicy();
                break;
            }
            else if (empType.equalsIgnoreCase("Part-Time")) {
                System.out.print("Enter name: ");
                String empName = input.nextLine();
                System.out.print("Enter hourly rate: ");
                double empHourlyRate = input.nextDouble();
                input.nextLine();
                System.out.print("Enter hourly worked: ");
                int empHours = input.nextInt();
                PartTimeEmployee partTime = new PartTimeEmployee(empName, empHourlyRate, empHours);
                partTime.calculateSalary();
                partTime.companyPolicy();
                break;
            }
            else {
                System.out.println("Error!");
            }
        }


    }
}