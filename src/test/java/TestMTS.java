import lesson9.DriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class TestMTS {
    protected WebDriver driver;

    @Test
    public void openMTS() {
        driver = DriverManager.getDriver();
        driver.get("https://www.mts.by/");
        WebElement acceptCookie = driver.findElement(By.xpath("//*[text() = 'Принять']"));
        acceptCookie.click();

    }

    @Test
    void testLogo() {
        List<WebElement> logos = driver.findElements(By.cssSelector(".pay-partners img, .payment-systems img"));
        assertTrue(logos.isEmpty());
    }

    @Test
    void testMain() {
        driver.findElement(By.linkText("Подробнее о сервисе")).click();
        assertTrue(driver.getCurrentUrl().contains("poryadok-oplaty-i-bezopasnost"));
        driver.navigate().back();
    }

    @Test
    void testNumberSimple() {

        WebElement phoneField = driver.findElement(By.id("connection-phone"));
        WebElement sumField = driver.findElement(By.id("connection-sum"));

// Вводим текст напрямую через выполнение JavaScript кода
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='297777777';", phoneField);
        js.executeScript("arguments[0].value='10';", sumField);

// Кликаем по кнопке
        WebElement button = driver.findElement(By.cssSelector("form button[type='submit']"));
        js.executeScript("arguments[0].click();", button);
    }
    @Test
    void testFirst() {
        WebElement title = driver.findElement(By.xpath("//*[contains(text() , 'Онлайн пополнение')]"));
        assertEquals("Онлайн пополнение\nбез комиссии", title.getText());
    }
}