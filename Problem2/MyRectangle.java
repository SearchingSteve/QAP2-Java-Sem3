// MyRectangle class with top left and bottom right points, 
// and methods to get width, length, perimeter, area, and corner points

package Problem2;

import Common.MyPoint;

// MyRectangle class with top left and bottom right points,
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Initial Constructor
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Overloaded constructor using MyPoint
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and Setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // **// No set methods for these points as they will cause a non-rectangular
    // shape and throw off the script
    public MyPoint getTopRight() {
        return new MyPoint(bottomRight.getX(), topLeft.getY());
    }

    public MyPoint getBottomLeft() {
        return new MyPoint(topLeft.getX(), bottomRight.getY());
    }
    // **//

    // Array of top left and bottom right corner points
    public MyPoint[] getCornerPoints() {
        return new MyPoint[] { getTopLeft(), getBottomRight() };
    }

    public void setCornerPoints(int x1, int y1, int x2, int y2) {
        topLeft.setXY(x1, y1);
        bottomRight.setXY(x2, y2);
    }

    // Array of all the corner points
    public MyPoint[] getAllPointCoords() {
        return new MyPoint[] { getTopLeft(), getTopRight(), getBottomRight(), getBottomLeft() };
    }

    // Getters for width, length, perimeter, and area
    public double getWidth() {
        return Math.abs(topLeft.getX() - bottomRight.getX());
    }

    public double getLength() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getLength());
    }

    public double getArea() {
        return (getWidth() * getLength());
    }

    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}