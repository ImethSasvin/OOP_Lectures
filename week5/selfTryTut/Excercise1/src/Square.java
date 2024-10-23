public class Square extends GeometricObject{
    protected double side;

    public Square(){

    }

    public Square(double side){
        this.side = side;
    }
    public Square(double side,String colour, boolean filled){
        this.side = side;
        this.colour = colour;
        this.filled = filled;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return side*4;
    }

    public String getShape(){
        return "□";
    }
    public String toString(){
        return "Colour: " + colour + " Filled: " + filled + " Side: " + side;
    }

}
