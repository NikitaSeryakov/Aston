package geometry;

interface Shape {
    double calculateArea();

    double calculatePerimeter();

    String getColor();

    String getBorderColor();

    default void printInfo() {
        System.out.println("--- " + this.getClass().getSimpleName() + " ---");
        System.out.println("Цвет заливки: " + getColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.printf("Площадь: %.2f\n", calculateArea());
        System.out.printf("Периметр: %.2f\n", calculatePerimeter());
    }
}

class Circle implements Shape {
    private double radius;
    private String color;
    private String borderColor;

    public Circle(double radius, String color, String borderColor) {
        this.radius = radius;
        this.color = color;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;
    private String color;
    private String borderColor;

    public Rectangle(double width, double height, String color, String borderColor) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String color;
    private String borderColor;

    public Triangle(double a, double b, double c, String color, String borderColor) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        this.color = color;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        double p = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

