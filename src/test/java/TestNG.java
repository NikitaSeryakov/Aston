import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {
    Calculator calc = new Calculator();

    @Test(description = "Факториал")
    public void testFactorial() {
        Assert.assertEquals(calc.factorial(3), 6);
    }

    @Test(description = "Площадь треугольника")
    public void testTriangleArea() {
        Assert.assertEquals(calc.triangleArea(4, 3), 6.0);
    }

    @Test(description = "Арифметические вычисления")
    public void testArithmetic() {
        Assert.assertEquals(calc.add(5, 10), 15);
        Assert.assertEquals(calc.divide(10, 4), 2.5);
    }

    @Test(description = "Сравнение")
    public void testCompare() {
        Assert.assertEquals(calc.compare(3, 4), "less");
    }
}