package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean isBlockTitleDisplayed() {
        WebElement blockTitle = driver.findElement(By.xpath("//*[contains(text() , 'Онлайн пополнение')]"));
        return blockTitle.isDisplayed();
    }


    public boolean arePaymentLogosDisplayed() {
        List<WebElement> logos = driver.findElements(By.cssSelector(".pay-partners img, .payment-systems img"));
        return logos.size() > 0;
    }


    public void clickServiceLink() {
        WebElement serviceLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        serviceLink.click();
    }

    public void goBack() {
        driver.navigate().back();
    }

    public void fillFormAndContinue(String serviceType, String phoneNumber) {
        driver.findElement(By.xpath("//input[@placeholder = 'Номер телефона']")).sendKeys(serviceType);
        driver.findElement(By.xpath("//input[@placeholder = 'Сумма']"));
        driver.findElement(By.xpath("//*[button = 'Продолжить']")).click();
    }

    public boolean isOnDetailPage() {
        return driver.getPageSource().contains("Проверка номера");
    }


    public String getPlaceholderText(String fieldID) {
        WebElement field = driver.findElement(By.xpath("//input[@class='total_rub' and @placeholder='Сумма']"));
        return field.getAttribute("placeholder"); // Получаем текст подсказки
    }


    public boolean isPaymentIconsDisplayed() {
        List<WebElement> icons = driver.findElements(By.xpath("//div[contains(@class, 'icons-container')]"));
        return icons.size() > 0;
    }


    public boolean verifyAmountsAndPhoneNumber(String expectedAmount, String expectedPhoneNumber) {
        String actualAmount = driver.findElement(By.xpath("//input[@id='connection-sum']")).getText();
        String actualPhoneNumber = driver.findElement(By.xpath("//input[@id='connection-phone']")).getText();
        return actualAmount.equals(expectedAmount) && actualPhoneNumber.equals(expectedPhoneNumber);
    }
}