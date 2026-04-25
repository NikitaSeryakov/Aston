package geometry;

public class Calculator {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(4, "Red", "Black"),
                new Rectangle(3, 6, "Blue", "White"),
                new Triangle(3, 3, 5, "Green", "Yellow")
        };
        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }
}

