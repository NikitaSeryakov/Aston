package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiter;

import java.util.List;

import static utils.DriverManager.driver;

public class MainPage {
    @FindBy(xpath = "//*[text() = 'Принять']")
    private List<WebElement> cookieButton;
    @FindBy(xpath = "//input[@placeholder = 'Номер телефона']")
    private WebElement telethonNumber;
    @FindBy(xpath = "//input[@placeholder = 'Сумма']")
    private WebElement depositSum;
    @FindBy(xpath = "//button[text() = 'Продолжить']")
    private WebElement buttonContinue;

    public MainPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public MainPage acceptCookie() {
        if (!cookieButton.isEmpty()) {
        cookieButton.get(0).click();
            Waiter.waitElementToBeInvisible(cookieButton.get(0));
        }
        return this;
    }

    public MainPage addNumber(String telethon) {
        telethonNumber.sendKeys(telethon);
        return this;
    }

    public MainPage addSum(String sum) {
        depositSum.sendKeys(sum);
        return this;
    }

    public MainPage clickButtonContinue() {
        buttonContinue.click();
        return this;
    }
}
