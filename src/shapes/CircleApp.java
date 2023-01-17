package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Lets get a radius for our circle");
        Circle circle = new Circle(input.getDouble());
        System.out.printf("Circle's area: %f; Circle's circumference: %f.%n", circle.getArea(), circle.getCircumference());
    }
}
