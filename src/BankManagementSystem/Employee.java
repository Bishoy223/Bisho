package BankManagementSystem;

import java.util.Scanner;

public class Employee {
    public int id;
    public static String firstName;
    public static String lastName;
    public static String address;
    public static String position;

    public Employee(int id,String firstName,String lastName,String address, String position) {
        this.id=id;
        Employee.firstName = firstName;
        Employee.lastName = lastName;
        Employee.address = address;
        Employee.position = position;
    }



    public static void editInfo(String address, String position) {
        if (address != null && !address.isEmpty()) {
            Employee.address = address;
        }
        if (position != null && !position.isEmpty()) {
            Employee.position = position;
        }
        System.out.println("Employee information updated.");
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public static String getName() {
        return firstName+lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public String toString() {
        return "Employee{" +
                ", name='" + firstName + " " + lastName + '\'' +
                ", Address: " + address +
                ", position='" + position + '\'' +
                '}';
    }

    public static Employee createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter employee first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter employee last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter employee position: ");
        String position = scanner.nextLine();
        System.out.print("Enter employee address: ");
        String address = scanner.nextLine();
        return new Employee(id, firstName, lastName,address,position);
    }
}

