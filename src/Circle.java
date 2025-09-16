// Circle.java
public class Circle {
    private double radius;
    private String color;

    // Default constructor
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // Constructor with radius
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // Constructor with radius and color
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
