package rectangle;
// Rectangle class definition
class Rectangle {
    // Properties
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to display the details of the rectangle
    public void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
    }
}

// Main class to test the Rectangle class
public class Main {
    public static void main(String[] args) {
        // Creating rectangle objects
        Rectangle rectangle1 = new Rectangle(5, 3);
        Rectangle rectangle2 = new Rectangle(7, 4);

        // Displaying the perimeter and area of rectangle1
        System.out.println("Rectangle 1:");
        rectangle1.displayDetails();

        // Displaying the perimeter and area of rectangle2
        System.out.println("\nRectangle 2:");
        rectangle2.displayDetails();
    }
}
