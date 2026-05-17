import lesson9.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class TestMTS {
    protected WebDriver driver;

    @Test
    public void openMts() {
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
    void testNumber() {
        final By TELEFON_NUMBER = By.xpath("//input[@placeholder = 'Номер телефона']");
        final By SUM = By.xpath("//input[@placeholder = 'Сумма']");
        final By CONTINUE = By.xpath("//*[button = 'Продолжить']");

        driver.findElement(TELEFON_NUMBER).sendKeys("297777777");
        driver.findElement(SUM).sendKeys("200");
        driver.findElement(CONTINUE).click();
    }

    @Test
    void testFirst() {
        WebElement title = driver.findElement(By.xpath("//*[contains(text() , 'Онлайн пополнение')]"));
        assertEquals("Онлайн пополнение\nбез комиссии", title.getText());
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}