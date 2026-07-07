package com.coforge.ems.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.coforge.ems.controller.EmployeeController;
import com.coforge.ems.model.Employee;

public class EmployeeApp {

    private static EmployeeController controller = new EmployeeController();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String confirmation = "";

        do {

            System.out.println("\n========= EMPLOYEE MANAGEMENT SYSTEM =========");
            System.out.println("1. Create Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Find Employee");
            System.out.println("5. Find All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.println("Enter Employee ID, Name, Salary and Department No:");

                Employee emp = new Employee(
                        sc.nextInt(),
                        sc.next(),
                        sc.nextInt(),
                        sc.nextInt());

                String res = controller.createEmployee(emp);
                System.out.println(res);

                break;

            case 2:

                System.out.println("Enter Employee ID, Name, Salary and Department No:");

                Employee e = new Employee(
                        sc.nextInt(),
                        sc.next(),
                        sc.nextInt(),
                        sc.nextInt());

                res = controller.updateEmployee(e);
                System.out.println(res);

                break;

            case 3:

                System.out.print("Enter Employee ID: ");

                int id = sc.nextInt();

                res = controller.deleteEmployee(id);
                System.out.println(res);

                break;

            case 4:

                System.out.print("Enter Employee ID: ");

                id = sc.nextInt();

                Employee emp1 = controller.findEmployee(id);

                if (emp1 != null)
                    System.out.println(emp1);
                else
                
                    System.out.println("Employee not found.");

                break;

            case 5:

                ArrayList<Employee> list = controller.findAllEmployees();

                if (list != null && !list.isEmpty()) {

                    System.out.println("\n------ Employee Records ------");

                    for (Employee employee : list) {
                        System.out.println(employee);
                    }

                } else {

                    System.out.println("No employee records found.");

                }

                break;

            case 6:

                System.out.println("Thank you for using EMS.");
                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice!");

            }

            System.out.print("\nDo you want to continue (Yes/No)? ");
            confirmation = sc.next();
            

        } while (confirmation.equalsIgnoreCase("Yes"));

        sc.close();
    }
}