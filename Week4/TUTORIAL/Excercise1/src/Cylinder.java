public class Cylinder {
    private double radius;
    private double height;

    public Cylinder() {
        this.radius = 1.0;
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        this.radius = radius;
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getVolume() {
        return getArea() * height;
    }
}