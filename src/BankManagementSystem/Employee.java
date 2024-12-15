package BankManagementSystem;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String position;
    private String graduatedCollege;
    private int yearOfGraduation;
    private String totalGrade;

    private static int idCounter = 1;

    public Employee(String firstName, String lastName, String address, String position, String graduatedCollege, int yearOfGraduation, String totalGrade) {
        this.id = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.position = position;
        this.graduatedCollege = graduatedCollege;
        this.yearOfGraduation = yearOfGraduation;
        this.totalGrade = totalGrade;
    }

    public int getId() {
        return id;
    }

    public void editInfo(String address, String position) {
        if (address != null && !address.isEmpty()) {
            this.address = address;
        }
        if (position != null && !position.isEmpty()) {
            this.position = position;
        }
        System.out.println("Employee information updated.");
    }

    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + firstName + " " + lastName + ", Address=" + address +
                ", Position=" + position + ", College=" + graduatedCollege + ", Year=" + yearOfGraduation +
                ", Grade=" + totalGrade + "]";
    }
}
