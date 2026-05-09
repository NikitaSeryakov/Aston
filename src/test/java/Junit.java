import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class JUnit {
    Calculator calc = new Calculator();

    @Test
    @DisplayName("Тест факториала")
    void testFactorial() {
        assertEquals(2, calc.factorial(2));
    }

    @Test
    @DisplayName("Тест площади треугольника")
    void testTriangleArea() {
        assertEquals(10.0, calc.triangleArea(4, 5));
    }

    @Test
    @DisplayName("Тест арифметических действий")
    void testArithmetic() {
        assertAll(
                () -> assertEquals(10, calc.add(6, 4)),
                () -> assertEquals(6, calc.subtract(11, 5)),
                () -> assertEquals(15, calc.multiply(5, 3)),
                () -> assertEquals(2.0, calc.divide(6, 3))
        );
    }

    @Test
    @DisplayName("Тест сравнения")
    void testCompare() {
        assertEquals("greater", calc.compare(3, 1));
    }
}