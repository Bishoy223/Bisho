package BankManagementSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Admin {
    public List<Employee> employees;
    public List<Client> clients;
    public List<Transaction> transactions; // List to store transactions

    public Admin() {
        employees = new ArrayList<>();
        clients = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Add employee, client, and transaction
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    // Display all employees
    public void displayAllEmployees() {
        System.out.println("\nList of All Employees:");
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    // Display all clients
    public void displayAllClients() {
        System.out.println("\nList of All Clients:");
        if (clients.isEmpty()) {
            System.out.println("No clients found.");
        } else {
            for (Client client : clients) {
                System.out.println(client);
            }
        }
    }

    // Method to display all transactions by a specific date
    public void displayTransactionsByDate(String dateInput) {
        System.out.println("\nTransactions on " + dateInput + ":");
        boolean found = false;
        for (Transaction transaction : transactions) {
            if (transaction.getDate().toString().contains(dateInput)) { // match by date input
                System.out.println(transaction);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No transactions found on this date.");
        }
    }

    // Method to display all transactions for a specific client
    public void displayTransactionsByClient(Client client) {
        System.out.println("\nTransactions for Client: " + client.getFirstName() + " " + client.getLastName());
        boolean found = false;
        for (Transaction transaction : transactions) {
            if (transaction.getClient().equals(client)) {
                System.out.println(transaction);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No transactions found for this client.");
        }
    }

    // Method to display all transactions for a specific employee
    public void displayTransactionsByEmployee(Employee employee) {
        System.out.println("\nTransactions by Employee: " + employee.getFirstName() + " " + employee.getLastName());
        boolean found = false;
        for (Transaction transaction : transactions) {
            if (transaction.getEmployee().equals(employee)) {
                System.out.println(transaction);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No transactions found by this employee.");
        }
    }
}
