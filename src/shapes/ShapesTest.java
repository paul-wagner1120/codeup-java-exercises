package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,6);

        System.out.println(box1.length);

        System.out.println("rectangle.getArea() =  "+ box1.getArea());
        System.out.println("rectangle.getArea() =  "+ box1.getPerimeter());

        Rectangle box2 = new Square(4);

        System.out.println("rectangle.getArea() =  "+ box2.getArea());
        System.out.println("rectangle.getArea() =  "+ box2.getPerimeter());
    }
}
