public class TestCircle {
    public static void main(String[] args) {
        // Uji constructor baru Circle(double, String)
        Circle c1 = new Circle(5.0, "blue");
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Area: " + c1.getArea());
        System.out.println(c1.toString());

        // Uji setter color
        c1.setColor("green");
        System.out.println("After change color: " + c1.getColor());
    }
}
