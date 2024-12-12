package BankManagementSystem;

import BankManagementSystem.Client;
import BankManagementSystem.Employee;

import java.util.Date;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Transaction {
    public int transactionId;
    public Date date;
    public double amount;
    public String type; // e.g., Deposit, Withdrawal, Transfer
    public Client client;
    public Employee employee;

    // Constructor
    public Transaction(int transactionId, Date date, double amount, String type, Client client, Employee employee) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.type = type;
        this.client = client;
        this.employee = employee;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public Client getClient() {
        return client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", date=" + date +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", client=" + client.getFirstName() + " " + client.getLastName() +
                ", employee=" + employee.getFirstName() + " " + employee.getLastName() +
                '}';
    }

    // Static method to create a transaction
    public static Transaction createTransaction(List<Client> clients, List<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter transaction ID: ");
        int transactionId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter transaction type (Deposit/Withdrawal/Transfer): ");
        String type = scanner.nextLine();

        // Select client
        System.out.print("Enter client name (first name): ");
        String clientFirstName = scanner.nextLine();
        Client client = clients.stream()
                .filter(c -> c.getFirstName().equals(clientFirstName))
                .findFirst()
                .orElse(null);

        // Select employee
        System.out.print("Enter employee name (first name): ");
        String employeeFirstName = scanner.nextLine();
        Employee employee = employees.stream()
                .filter(e -> e.getFirstName().equals(employeeFirstName))
                .findFirst()
                .orElse(null);

        Date date = new Date(); // Current date

        return new Transaction(transactionId, date, amount, type, client, employee);
    }
}
