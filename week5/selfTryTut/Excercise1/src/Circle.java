public class Circle extends GeometricObject{

    protected double radius;
    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled){
        this.radius = radius;
        this.colour = colour;
        this.filled = filled;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public String getShape(){
        return "Circle";
    }

    public String toString(){
        return "Colour: " + colour + " Filled: " + filled + " Radius: " + radius;
    }

}
