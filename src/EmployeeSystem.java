import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter
    public int getId() {
        return id;
    }

    // Display Method
    public void display() {
        System.out.println("\nEmployee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }

    // Update Salary
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
        System.out.println("Salary Updated Successfully!");
    }
}

public class EmployeeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new Employee(id, name, salary));
                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No Employees Found!");
                    } else {
                        for (Employee emp : employees) {
                            emp.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Employee emp : employees) {
                        if (emp.getId() == searchId) {
                            emp.display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update Salary: ");
                    int updateId = sc.nextInt();
                    boolean updated = false;

                    for (Employee emp : employees) {
                        if (emp.getId() == updateId) {
                            System.out.print("Enter New Salary: ");
                            double newSalary = sc.nextDouble();
                            emp.updateSalary(newSalary);
                            updated = true;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();
                    boolean removed = employees.removeIf(emp -> emp.getId() == deleteId);

                    if (removed) {
                        System.out.println("Employee Deleted Successfully!");
                    } else {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 6:
                    System.out.println("Thank You! Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
