package BankManagementSystem;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SystemManager systemManager = new SystemManager();
        Admin admin = new Admin();

        while (true) {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Add Client");
            System.out.println("3. View All Employees");
            System.out.println("4. View All Clients");
            System.out.println("5. Edit Employee");
            System.out.println("6. Edit Client");
            System.out.println("7. Create Transaction");
            System.out.println("8. View Transactions by Date");
            System.out.println("9. View Transactions by Client");
            System.out.println("10. View Transactions by Employee");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Employee
                    Employee newEmployee = Employee.createEmployee();
                    systemManager.addEmployee(newEmployee.id, newEmployee.getFirstName(),
                            newEmployee.getLastName(), newEmployee.getAddress(), newEmployee.getPosition());
                    break;

                case 2:
                    // Add Client
                    Client newClient = Client.createClient();
                    systemManager.clients.add(newClient);
                    admin.addClient(newClient);
                    break;

                case 3:
                    // View All Employees
                    systemManager.displayEmployees();
                    break;

                case 4:
                    // View All Clients
                    admin.displayAllClients();
                    break;

                case 5:
                    // Edit Employee
                    System.out.print("Enter employee name to edit: ");
                    String employeeName = scanner.nextLine();
                    System.out.print("Enter new address (or press Enter to skip): ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter new position (or press Enter to skip): ");
                    String newPosition = scanner.nextLine();
                    systemManager.editEmployee(employeeName, newAddress, newPosition);
                    break;

                case 6:
                    // Edit Client
                    System.out.print("Enter client account number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new telephone number: ");
                    String newTelephone = scanner.nextLine();
                    systemManager.editClient(accountNumber, newTelephone);
                    break;

                case 7:
                    // Create Transaction
                    if (systemManager.clients.isEmpty() || systemManager.employees.isEmpty()) {
                        System.out.println("Ensure both clients and employees exist to create a transaction.");
                    } else {
                        Transaction transaction = Transaction.createTransaction(systemManager.clients, systemManager.employees);
                        admin.addTransaction(transaction);
                        System.out.println("Transaction successfully created.");
                    }
                    break;

                case 8:
                    // View Transactions by Date
                    System.out.print("Enter date (yyyy-mm-dd): ");
                    String date = scanner.nextLine();
                    admin.displayTransactionsByDate(date);
                    break;

                case 9:
                    // View Transactions by Client
                    System.out.print("Enter client first name: ");
                    String clientFirstName = scanner.nextLine();
                    Client client = systemManager.clients.stream()
                            .filter(c -> c.getFirstName().equalsIgnoreCase(clientFirstName))
                            .findFirst()
                            .orElse(null);
                    if (client != null) {
                        admin.displayTransactionsByClient(client);
                    } else {
                        System.out.println("Client not found.");
                    }
                    break;

                case 10:
                    // View Transactions by Employee
                    System.out.print("Enter employee first name: ");
                    String employeeFirstName = scanner.nextLine();
                    Employee employee = systemManager.employees.stream()
                            .filter(e -> e.getFirstName().equalsIgnoreCase(employeeFirstName))
                            .findFirst()
                            .orElse(null);
                    if (employee != null) {
                        admin.displayTransactionsByEmployee(employee);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 11:
                    // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
