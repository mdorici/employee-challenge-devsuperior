package application;

import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Department name: ");
        String departmentName = sc.nextLine();
        System.out.print("Pay Day: ");
        int payDay = sc.nextInt();
        System.out.print("Email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();

        Address address = new Address(email, phone);
        Department department = new Department(departmentName, payDay, address);

        System.out.print("How many employees does the department have? ");
        int quantityEmployees = sc.nextInt();

        for(int i = 0; i < quantityEmployees; i++) {
            System.out.printf("Employee data #%d: %n", i+1);
            System.out.print("Name: ");
            sc.nextLine();
            String employeeName = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(employeeName, salary);
            department.addEmployee(employee);
        }

        System.out.println();
        showReport(department);

        sc.close();
    }

    private static void showReport(Department department) {
        System.out.printf("SHOW REPORT: %n%s", department.toString());
    }
}
