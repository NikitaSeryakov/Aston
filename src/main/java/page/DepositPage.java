package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositPage extends BasePage {
    @FindBy(xpath = "//input[@placeholder = 'Номер телефона']")
    private WebElement telethonNumber;
    @FindBy(xpath = "//input[@placeholder = 'Сумма']")
    private WebElement depositSum;
    @FindBy(xpath = "//button[text() = 'Продолжить']")
    private WebElement buttonContinue;

    public DepositPage addNumber(String telethon) {
        telethonNumber.sendKeys(telethon);
        return this;
    }

    public DepositPage addSum(String sum) {
        depositSum.sendKeys(sum);
        return this;
    }

    public DepositPage clickButton() {
        buttonContinue.click();
        return this;
    }

}
