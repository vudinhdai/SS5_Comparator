import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        if (r1.getArea() > r2.getArea() || r1.getPerimter() > r2.getPerimter())
            return 1;
        else if (r1.getArea() < r2.getArea() || r1.getPerimter() < r2.getPerimter())
            return -1;
        else return 0;


    }
}
