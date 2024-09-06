package employee;
import java.util.ArrayList;

class Employee {
    // Properties
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    // Additional property specific to Manager
    double bonus;

    // Constructor
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    // Method to calculate total salary including bonus
    public double calculateTotalSalary() {
        return salary + bonus;
    }

    // Override displayInfo method to include bonus
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary (with bonus): " + calculateTotalSalary());
    }
}

class Engineer extends Employee {
    // Additional property specific to Engineer
    double projectAllowance;

    // Constructor
    public Engineer(String name, int id, double salary, double projectAllowance) {
        super(name, id, salary);
        this.projectAllowance = projectAllowance;
    }

    // Method to calculate total salary including project allowance
    public double calculateTotalSalary() {
        return salary + projectAllowance;
    }

    // Override displayInfo method to include project allowance
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Project Allowance: " + projectAllowance);
        System.out.println("Total Salary (with allowance): " + calculateTotalSalary());
    }
}

public class Company {
    public static void main(String[] args) {
        // Creating objects of Manager and Engineer
        Manager manager = new Manager("Alice", 101, 75000, 15000);
        Engineer engineer = new Engineer("Bob", 102, 65000, 10000);

        // Storing the objects in an ArrayList
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(engineer);

        // Displaying information of each employee
        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println("---------------");
        }
    }
}
/*public class Employee {
    // Private properties
    private String name;
    private int id;
    private double salary;
    private String designation;

    // Constructor to initialize Employee object
    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for id
    public int getId() {
        return id;
    }

    // Setter method for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter method for designation
    public String getDesignation() {
        return designation;
    }

    // Setter method for designation
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 101, 50000.0, "Software Engineer");

        // Displaying the employee details
        emp.displayEmployeeDetails();

        // Updating the employee details
        emp.setName("Jane Smith");
        emp.setSalary(60000.0);
        emp.setDesignation("Senior Software Engineer");

        // Displaying the updated employee details
        emp.displayEmployeeDetails();
    }
}
/*public class Employee {
    // Properties
    private String name;
    private int id;
    private double salary;
    private String designation;

    // Default Constructor
    public Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0.0;
        this.designation = "Not assigned";
    }

    // Parameterized Constructor (Constructor Overloading)
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 0.0;
        this.designation = "Not assigned";
    }

    // Another Parameterized Constructor (Constructor Overloading)
    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    // Getter and Setter methods (Using 'this' keyword)

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Method Overloading
    public void display() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
    }

    public void display(boolean showSalary) {
        display(); // Call the basic display method
        if (showSalary) {
            System.out.println("Salary: " + this.salary);
            System.out.println("Designation: " + this.designation);
        }
    }

    public static void main(String[] args) {
        // Using default constructor
        Employee emp1 = new Employee();
        emp1.display();

        System.out.println();

        // Using parameterized constructor with name and id
        Employee emp2 = new Employee("John", 101);
        emp2.display();

        System.out.println();

        // Using parameterized constructor with all properties
        Employee emp3 = new Employee("Alice", 102, 60000, "Manager");
        emp3.display(true); // Show full details including salary and designation
    }
}
/*public class Employee {
    private String name;
    private int id;
    private double salary;
    private String designation;

    // Constructor overloading
    Employee() {
        // Default constructor
    }

    Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Method overloading
    public double calculateSalary() {
        return salary;
    }

    public double calculateSalary(double bonus) {
        return salary + bonus;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
        System.out.println("Designation: " + designation);
    }
}

// Example usage
//public class Main {
    public static void main(String[] args) {
        // Creating an Employee object using the default constructor
        Employee employee1 = new Employee();
        employee1.setName("John Doe");
        employee1.setId(1001);
        employee1.setSalary(5000.0);
        employee1.setDesignation("Software Engineer");

        // Creating an Employee object using the parameterized constructor
        Employee employee2 = new Employee("Jane Smith", 1002, 6000.0, "Senior Software Engineer");

        // Displaying employee details
        employee1.displayEmployeeDetails();
        System.out.println();
        employee2.displayEmployeeDetails();

        // Calculating salaries
        System.out.println("\nSalary of Employee 1: $" + employee1.calculateSalary());
        System.out.println("Salary of Employee 2 with bonus: $" + employee2.calculateSalary(1000.0));
    }
}
/*public class Employee {
    private String name;
    private int id;
    private double salary;
    private String designation;

    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 1234, 50000.0, "Software Engineer");

        System.out.println("Initial Values:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("ID: " + emp1.getId());
        System.out.println("Salary: $" + emp1.getSalary());
        System.out.println("Designation: " + emp1.getDesignation());

        emp1.setName("Jane Smith");
        emp1.setSalary(55000.0);

        System.out.println("\nUpdated Values:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: $" + emp1.getSalary());
    }



/*public class Employee {
 private String name;
    private int id;
    private double salary;
    private String designation;

    // Constructor
    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}*/
