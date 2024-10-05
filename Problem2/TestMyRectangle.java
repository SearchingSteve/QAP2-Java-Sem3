package Problem2;
import Common.MyPoint;
import java.util.Arrays;

public class TestMyRectangle {
    public static void main(String[] args){
        MyRectangle r1 = new MyRectangle(0, 5, 5, 0);
        System.out.println(r1);

        System.out.println("TopLeft is " + r1.getTopLeft());
        r1.setTopLeft(new MyPoint(0, 1));
        System.out.println(r1);

        System.out.println("BottomRight is " + r1.getBottomRight());
        r1.setBottomRight(new MyPoint(1,0));
        System.out.println(r1);

        System.out.println("TopRight is " + r1.getTopRight());
        System.out.println("BottomLeft is " + r1.getBottomLeft());
                
        System.out.println("Corner points are " + Arrays.toString(r1.getCornerPoints()));
        System.out.println("All points are " + Arrays.toString(r1.getAllPointCoords()));
        r1.setCornerPoints(0, 3, 3, 0); 
        System.out.println(r1);
        
        System.out.println("Width is " + r1.getWidth() + " units");
        System.out.println("Length is " + r1.getLength() + " units");
        System.out.println("Perimeter is " + r1.getPerimeter() + " units");
        System.out.println("Area is " + r1.getArea() + " square units");
    }
}