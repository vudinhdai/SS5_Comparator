
public class Circle extends Shape {
    private double radius=1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;

    }

    public double getPerimter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return " A Circle of color of = " + getRadius() + " which is a subclass " + super.toString();
    }
}
