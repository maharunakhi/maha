package person;
public class Person {
    // Properties
    private String name;
    private int age;
    private String gender;
    private String address;

    // Constructor
    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    // Getter and Setter for gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object of Person class
        Person person = new Person("John Doe", 25, "Male", "123 Main St");

        // Accessing the properties using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Address: " + person.getAddress());

        // Modifying properties using setter methods
        person.setName("Jane Doe");
        person.setAge(30);
        person.setGender("Female");
        person.setAddress("456 Elm St");

        // Displaying modified properties
        System.out.println("\nUpdated Information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Address: " + person.getAddress());
    }
}
/*public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
        this.address = "Unknown";
    }

    // Parameterized constructor
    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // Copy constructor
    public Person(Person person) {
        this(person.name, person.age, person.gender, person.address);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Overloaded method to print person details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }

    public void printDetails(String message) {
        System.out.println(message);
        printDetails();
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Person person1 = new Person();
        Person person2 = new Person("John Doe", 25, "Male", "123 Main St.");
        Person person3 = new Person(person2);

        // Calling overloaded printDetails() method
        person1.printDetails("Default Person:");
        person2.printDetails("Person 2:");
        person3.printDetails("Person 3 (copy of Person 2):");

        // Using setters
        person1.setName("Jane Smith");
        person1.setAge(30);
        person1.setGender("Female");
        person1.setAddress("456 Oak Rd.");

        System.out.println("\nPerson 1 after using setters:");
        person1.printDetails();
    }
}

/*public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;

    // Constructor
    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }
    public void displayPersonDetails(String message) {
        System.out.println(message);
        displayPersonDetails();
    }
}


public class Main {
    public static void main(String[] args) {
       
        Person person1 = new Person();
        person1.displayPersonDetails("Person 1 details:");

       
        Person person2 = new Person("John Doe", 25);
        person2.setGender("Male");
        person2.setAddress("123 Main St, Anytown USA");
        person2.displayPersonDetails("Person 2 details:");

        Person person3 = new Person("Jane Smith", 30, "Female", "456 Oak Rd, Somecity USA");
        person3.displayPersonDetails("Person 3 details:");
    }
}