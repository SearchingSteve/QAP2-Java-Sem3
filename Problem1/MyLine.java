// MyLine is a class to create a line object with two points
// and perform other operations.

package Problem1; // Package declaration

import Common.MyPoint; // Import the MyPoint class from the Common package

public class MyLine {
    private MyPoint begin; // Declare a MyPoint instance variable called begin
    private MyPoint end; // Declare a MyPoint instance variable called end

    // Default constructor that takes in the coordinates of the two points and
    // initializes line
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    // Overload constructor that initializes the line with two MyPoint objects
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter method for the begin point
    public MyPoint getBegin() {
        return begin;
    }

    // Setter method for the begin point
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Getter method for the end point
    public MyPoint getEnd() {
        return end;
    }

    // Setter method for the end point
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Getter method for the x-coordinate of the begin point
    public int getBeginX() {
        return begin.getX();
    }

    // Setter method for the x-coordinate of the begin point
    public void setBeginX(int x) {
        begin.setX(x);
    }

    // Getter method for the y-coordinate of the begin point
    public int getBeginY() {
        return begin.getY();
    }

    // Setter method for the y-coordinate of the begin point
    public void setBeginY(int y) {
        begin.setY(y);
    }

    // Getter method for the x-coordinate of the end point
    public int getEndX() {
        return end.getX();
    }

    // Setter method for the x-coordinate of the end point
    public void setEndX(int x) {
        end.setX(x);
    }

    // Getter method for the y-coordinate of the end point
    public int getEndY() {
        return end.getY();
    }

    // Setter method for the y-coordinate of the end point
    public void setEndY(int y) {
        end.setY(y);
    }

    // Method to retrieve the coordinates of the begin point as an array
    public int[] getBeginXY() {
        return begin.getXY();
    }

    // Method to set the coordinates of the begin point
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    // Method to retrieve the coordinates of the end point as an array
    public int[] getEndXY() {
        return end.getXY();
    }

    // Method to set the coordinates of the end point
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Method to calculate the length of the line using the distance formula
    public double getLength() {
        return begin.distance(end);
    }

    // Method to calculate the gradient angle of the line using the arctangent
    // function
    public double getGradient() {
        int yDiff = end.getY() - begin.getY();
        int xDiff = end.getX() - begin.getX();
        return Math.atan2(yDiff, xDiff);
    }

    // toString method to provide a string representation of the line
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }

}