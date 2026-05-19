import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.DriverManager.driver;

public class UITest extends BaseTest {
    @Test
    void testLogo() {
        mainPageService.openPageAndAcceptCookie();
        // Находим все логотипы по указанным селекторам
        List<WebElement> logos = driver.findElements(By.cssSelector(".pay-partners img, .payment-systems img"));

        // Проверяем, что список элементов не пуст
        assertFalse(logos.isEmpty(), "Логотипы платежных систем не найдены на странице!");

        // Проверяем, что каждый найденный логотип действительно виден пользователю
        for (WebElement logo : logos) {
            assertTrue(logo.isDisplayed(), "Один из логотипов скрыт!");
        }
    }

    @DataProvider(name = "correct values")
    public Object[][] getCorrectValues() {
        return new Object[][]{
                {"297777777", "200"}
        };
    }

    @Test(testName = "Test correct values", dataProvider = "correct values")
    @Description("Verify telethon number ")
    public void mayToPay(String telethon, String sum) {
        mainPageService.openPageAndAcceptCookie()
                .inputCorrectValues(telethon, sum);

    }
}

