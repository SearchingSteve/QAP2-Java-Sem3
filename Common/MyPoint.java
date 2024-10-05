package Common; // Package declaration

public class MyPoint {
    // Instance variables to store the coordinates of the point
    private int x = 0; // x-coordinate, initialized to 0
    private int y = 0; // y-coordinate, initialized to 0

    // Default constructor that initializes the point at the origin (0, 0)
    public MyPoint() {
        this.x = 0; // Set x-coordinate to 0
        this.y = 0; // Set y-coordinate to 0
    }

    // Constructor that initializes the point with specified coordinates
    public MyPoint(int x, int y) {
        this.x = x; // Set x-coordinate to the provided value
        this.y = y; // Set y-coordinate to the provided value
    }

    // Getter method for the x-coordinate
    public int getX() {
        return x; // Return the current x-coordinate
    }

    // Setter method for the x-coordinate
    public void setX(int x) {
        this.x = x; // Update the x-coordinate with the provided value
    }

    // Getter method for the y-coordinate
    public int getY() {
        return y; // Return the current y-coordinate
    }

    // Setter method for the y-coordinate
    public void setY(int y) {
        this.y = y; // Update the y-coordinate with the provided value
    }

    // Method to retrieve both coordinates as an array
    public int[] getXY() {
        int[] xy = {x, y}; // Create an array with the current x and y coordinates
        return xy; // Return the array
    }

    // Method to set both coordinates
    public void setXY(int x, int y) {
        this.x = x; // Update the x-coordinate
        this.y = y; // Update the y-coordinate
    }

    // Distance method 1: Calculate the distance to a point given by its coordinates
    public double distance(int x, int y) {
        // Calculate the distance using the distance formula
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    // Distance method 2: Calculate the distance to another MyPoint object (overloaded method)
    public double distance(MyPoint another) {
        // Calculate the distance using the distance formula
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }

    // Distance method 3: Calculate the distance from the origin (0, 0) (overloaded method)
    public double distance() {
        // Calculate the distance from the origin using the distance formula
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
//     @Override
// public String toString() {
//     return "(" + this.getX() + ", " + this.getY() + ")";
// }
   // toString method to provide a string representation of the point
    public String toString() {
        return "(" + x + "," + y + ")"; // Return the coordinates in (x, y) format
    }

}