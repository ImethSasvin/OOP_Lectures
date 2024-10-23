public class Rectangle extends GeometricObject{
    protected double length;
    protected double width;

    public Rectangle(){

    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String colour, boolean filled){
        this.length = length;
        this.width = width;
        this.colour = colour;
        this.filled = filled;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return ((width*2)+ (length*2));
    }
    public String getShape(){
        return "▭";
    }
    public String toString(){
        return "Colour: " + colour + " Filled: " + filled + " Area: " + getArea();
    }
}
