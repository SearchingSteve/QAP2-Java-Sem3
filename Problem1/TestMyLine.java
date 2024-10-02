package Problem1;
import java.util.Arrays;

import Common.MyPoint;
import Problem1.MyLine;



public class TestMyLine {
    public static void main(String[] args) {
        
        // Test MyLine constructor 1
        MyLine l1 = new MyLine(0, 0, 5, 10);
        System.out.println(l1); 

        // Test MyPoint constructor 2 (overloaded constructor using MyPoint)
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(2, 5);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println(l2); 
        
        // Test Setters and Getters
        l1.setBeginX(0);
        l1.setBeginY(0);
        l1.setEndX(3);
        l1.setEndY(6);
        System.out.println(l1); 
        System.out.println("begin x is: " + l1.getBeginX());
        System.out.println("begin y is: " + l1.getBeginY());
        System.out.println("end x is: " + l1.getEndX());
        System.out.println("end y is: " + l1.getEndY());
        
        // Test getBeginXY() and getEndXY()
        System.out.println("begin x and y are: " + Arrays.toString(l1.getBeginXY()));
        System.out.println("end x and y are: " + Arrays.toString(l1.getEndXY()));
        
        // Test setBeginXY() and setEndXY()
        l1.setBeginXY(10, 5);
        l1.setEndXY(2, 1);
        System.out.println(l1);  
        
        // Test getLength()
        System.out.printf("length is: %.2f <units>%n", l1.getLength());
        
        // Test getGradient()
      System.out.printf("Gradient is: %.2f radians%n", l1.getGradient());

    }
}
