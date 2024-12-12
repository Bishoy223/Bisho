package BankManagementSystem;

import java.util.Scanner;

public class Client {

    private static String firstName;
    private static String lastName;
    private static String username;
    private static String id;
    private static String telephoneNumber;
    private static Account accountNumber;

    public Client(String firstName, String lastName, String username, String id, String telephoneNumber, double initialBalance) {
        Client.firstName = firstName;
        Client.lastName = lastName;
        Client.username = username;
        Client.id = id;
        Client.telephoneNumber = telephoneNumber;
        Client.accountNumber = new Account(initialBalance); // Create the Account object
    }


    public Client(int accountNumber, String name, String contactInfo) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        Client.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public static String getName() {
        return firstName+lastName;
    }

    public void setLastName(String lastName) {
        Client.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        Client.username = username;
    }

    public String getID() {
        return id;
    }

    public void setID(String ID) {
        Client.id = ID;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        Client.telephoneNumber = telephoneNumber;
    }

    public static Account getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Account accountNumber) {
        Client.accountNumber = accountNumber;
    }

    public void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Username: " + username);
        System.out.println("ID: " + id);
        System.out.println("Telephone Number: " + telephoneNumber);
        accountNumber.displayAccountDetails();
    }
    public static void editInfo(String telephoneNumber) {
        if (telephoneNumber != null && !telephoneNumber.isEmpty()) {
            Employee.address = telephoneNumber;
        }
        
        System.out.println("Employee information updated.");
    }
    public static Client createClient() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter client first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter client last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter client username: ");
        String username = scanner.nextLine();

        System.out.print("Enter client ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter client telephone number: ");
        String telephoneNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        // Create an Account object
        Account account = new Account(initialBalance);

        // Construct the Client object
        return new Client(firstName, lastName, username,id, telephoneNumber, initialBalance);
    }

}
