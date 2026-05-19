import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverManager;
import page.MainPage;

public class UITest {
    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp() {
        driver = DriverManager.getDriver();  // Получаем экземпляр драйвера из DriverManager
        driver.get("https://mts.by");
        mainPage = new MainPage(driver);
        WebElement acceptCookie = driver.findElement(By.xpath("//*[text() = 'Принять']"));
        acceptCookie.click();
    }

    @Test
    public void testBlockTitle() {
        Assert.assertTrue("Блок 'Онлайн пополнение без комиссии' не найден", mainPage.isBlockTitleDisplayed());
    }

    @Test
    public void testPaymentLogos() {
        Assert.assertFalse("Логотипы платежных систем не найдены", mainPage.arePaymentLogosDisplayed());
    }

    @Test
    public void testServiceLink() {
        mainPage.clickServiceLink();
        Assert.assertFalse("Не удалось перейти на страницу 'Подробнее о сервисе'", driver.getTitle().contains("Подробнее о сервисе"));
        mainPage.goBack();
    }

    @Test
    public void testContinueButton() {
        String connectionErrorMessage = "Сумма"; //
        Assert.assertEquals("Неверное сообщение в поле для услуг связи", connectionErrorMessage, mainPage.getPlaceholderText("//input[@id='connection-sum']"));
        Assert.assertEquals("Неверное сообщение в поле для номера телефона", connectionErrorMessage, mainPage.getPlaceholderText("//input[@id='connection-phone']"));

        String phoneNumber = "297777777";
        String expectedAmount = "200.00";
        mainPage.fillFormAndContinue("Услуги связи", phoneNumber);

        Assert.assertFalse("Сумма или номер телефона отображаются неверно",
                mainPage.verifyAmountsAndPhoneNumber(expectedAmount, phoneNumber));

        Assert.assertEquals(connectionErrorMessage, mainPage.getPlaceholderText("//label[contains(text(), 'Номер карты')]"));
        Assert.assertEquals(connectionErrorMessage, mainPage.getPlaceholderText("//label[text()='Срок действия']"));
        Assert.assertEquals(connectionErrorMessage, mainPage.getPlaceholderText("//label[text()='CVC']"));
        Assert.assertFalse("Иконки платёжных систем не найдены", mainPage.isPaymentIconsDisplayed());
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
