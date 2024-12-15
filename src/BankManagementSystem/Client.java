public class Client {

    private String firstName;
    private String lastName;
    private String username;
    private String ID;
    private String telephoneNumber; 
    private Account accountNumber;

    public Client(String firstName, String lastName, String username, String ID, String telephoneNumber, double initialBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.ID = ID;
        this.telephoneNumber = telephoneNumber;
        this.accountNumber = new Account(initialBalance);
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Account getAccountNumber() {
        return accountNumber;
    }

    public void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Username: " + username);
        System.out.println("ID: " + ID);
        System.out.println("Telephone Number: " + telephoneNumber);
        
    }
}


    


