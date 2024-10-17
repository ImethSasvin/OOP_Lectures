public class Circle {

    private double radius = 1;
    private String colour = "blue";

    public Circle(){

    };

    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }

    public Circle(double radius) {
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColour(String colour){
        this.colour=colour;
    }

    public String getColour(){
        return colour;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public String toString(){
        return "Circle[radius="+radius+",colour="+colour+"]";
    }

}
