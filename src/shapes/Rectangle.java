package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        this.length = width;
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }

}
