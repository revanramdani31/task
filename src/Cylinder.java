// Cylinder.java
public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    // Override getArea -> surface area of cylinder
    @Override
    public double getArea() {
        double baseArea = super.getArea();
        double circumference = 2 * Math.PI * getRadius();
        return 2 * baseArea + circumference * height;
    }

    // Fix getVolume -> use superclass getArea()
    public double getVolume() {
        return super.getArea() * height;
    }

    // Task 1.3: Override toString
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
