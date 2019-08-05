
import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle(2.5);
        circles[2] = new Circle(3.5, "yellow",false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("Apter-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);

        }
        System.out.println("\n");


        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0]=new Rectangle(3.5,5.2);
        rectangles[1]=new Rectangle(6.9,4.1);
        rectangles[2]=new Rectangle(4.7,6.0);
        System.out.println("Pre-sorted:");
        for (Rectangle rectangle:rectangles) {
            System.out.println(rectangle);
        }
       RectangleComparator rectangleComparator =new RectangleComparator();
        Arrays.sort(rectangles,rectangleComparator);
        System.out.println("apter-sorted");
        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }


    }
}
