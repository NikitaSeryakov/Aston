public class Calculator {
    public long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Положительное число");
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public double triangleArea(double base, double height) {
        if (base <= 0 || height <= 0) throw new IllegalArgumentException("Параметры должны быть > 0");
        return 0.5 * base * height;
    }

    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Деление на ноль");
        return (double) a / b;
    }

    public String compare(int a, int b) {
        if (a > b) return "greater";
        if (a < b) return "less";
        return "equal";
    }
}